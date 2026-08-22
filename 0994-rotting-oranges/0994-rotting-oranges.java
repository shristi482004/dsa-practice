class Pair{
    int first;
    int second;
    int time;

    public Pair(int first,int second,int time)
    {
        this.first=first;
        this.second=second;
        this.time=time;
    }
}


class Solution {
    public int orangesRotting(int[][] mat) {
        Queue<Pair> q=new LinkedList<>();
        
        int n=mat.length;
        int m=mat[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==2)
                {q.add(new Pair(i,j,0));
                }
            }
        }
        int totaltime=0;
        while(!q.isEmpty())
        {
            int row=q.peek().first;
            int col=q.peek().second;
            int t=q.peek().time;
            mat[row][col]=2;
            vis[row][col]=true;
            totaltime=Math.max(totaltime,t);
            q.remove();
            int[] delro={-1,1,0,0};
            int[] delco={0,0,-1,1};
            for(int i=0;i<4;i++)
            {
                int r=row+delro[i];
                int c=col+delco[i];

                if(r>=0 && r<n && c>=0 && c<m
                && !vis[r][c] && mat[r][c]==1)
                {
                    vis[r][c]=true;
                    q.add(new Pair(r,c,t+1));
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
        {
            if(mat[i][j]==1)
            return -1;
        }
        }
        return totaltime;
    }
}