class Solution {
    public void dfs(int row,int col,boolean[][] vis,int[][] grid) {
        vis[row][col]=true;
        grid[row][col]=0;
        int n=grid.length;
        int m=grid[0].length;
        int[] delro={-1,1,0,0};
        int[] delco={0,0,1,-1};
        for(int i=0;i<4;i++)
        {
            int r=row+delro[i];
            int c=col+delco[i];

            if(r>=0 && r<n && c>=0 && c<m
            && !vis[r][c] && grid[r][c]==1)
            {
                dfs(r,c,vis,grid);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];

        for(int i=0;i<m;i++)
        {
            if(!vis[0][i] && grid[0][i]==1)
            {
                dfs(0,i,vis,grid);
            }

            if(!vis[n-1][i] && grid[n-1][i]==1)
            {
                dfs(n-1,i,vis,grid);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(!vis[i][0] && grid[i][0]==1)
            {
                dfs(i,0,vis,grid);
            }

            if(!vis[i][m-1] && grid[i][m-1]==1)
            {
                dfs(i,m-1,vis,grid);
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                count++;
            }
        }
        return count;
    }
}