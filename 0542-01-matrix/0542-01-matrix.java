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
    public int[][] updateMatrix(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0)
                {
                    vis[i][j]=true;
                    q.add(new Pair(i,j,0));
                }
            }
        }
        int maxtime=0;
        while(!q.isEmpty())
        {
            
            int row=q.peek().first;
            int col=q.peek().second;
            int t=q.peek().time;
            grid[row][col]=t;
            q.remove();

            int[] delro={-1,1,0,0};
            int[] delco={0,0,1,-1};

            for(int i=0;i<4;i++)
            {
            int r=row+delro[i];
            int c=col+delco[i];

            if(r>=0 && r<n && c>=0 && c<m
            && !vis[r][c] && grid[r][c]==1)
            {
                vis[r][c]=true;
                q.add(new Pair(r,c,t+1));
            }
            }
            
        }
       
        return grid;
    }
}