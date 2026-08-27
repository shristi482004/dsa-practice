class Solution {
    public void dfs(int row,int col,boolean[][] vis,char[][] grid)
    {
        vis[row][col]=true;
        int n=grid.length;
        int m=grid[0].length;
        int[] delro={-1,1,0,0};
        int[] delco={0,0,-1,1};
        for(int i=0;i<4;i++)
            {
                int r=row+delro[i];
                int c=col+delco[i];
                if(r>=0 && r<n && c>=0 && c<m
                && !vis[r][c] && grid[r][c]=='O')
                {
                    dfs(r,c,vis,grid);
                }
            }

    }
    public void solve(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='O')
                {
                    if(i==0 || i==n-1 || j==0 || j==m-1)
                    {
                        dfs(i,j,vis,grid);
                    }
                    
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!vis[i][j] && grid[i][j]=='O')
                {
                   grid[i][j]='X';
                    
                }
            }
        }
        
        return ;
    }
}