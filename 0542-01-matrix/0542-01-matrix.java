class Pair{
    int first;
    int second;
    int dist;

    public Pair(int first,int second,int dist)
    {
        this.first=first;
        this.second=second;
        this.dist=dist;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q=new LinkedList<>();
        
        int n=mat.length;
        int m=mat[0].length;
        boolean[][] vis=new boolean[n][m];
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {q.add(new Pair(i,j,0));
                }
            }
        }

        while(!q.isEmpty())
        {
            int row=q.peek().first;
            int col=q.peek().second;
            int d=q.peek().dist;
            vis[row][col]=true;
            ans[row][col]=d;

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
                    q.add(new Pair(r,c,d+1));
                }
            }
        }
        return ans;
    }
}