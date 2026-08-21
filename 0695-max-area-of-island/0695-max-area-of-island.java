class Solution {
    public int dfs(int row,int col,boolean[][] vis,int[][] grid)
    {
        int area=1;
        vis[row][col]=true;
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
                area+=dfs(r,c,vis,grid);
            }
        }
        return area;
    }


    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean [][] vis=new boolean[n][m];
        int maxarea=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!vis[i][j] && grid[i][j]==1)
                {
                    maxarea=Math.max(maxarea,dfs(i,j,vis,grid));
                }
            }
        }
        return maxarea;
    }
}