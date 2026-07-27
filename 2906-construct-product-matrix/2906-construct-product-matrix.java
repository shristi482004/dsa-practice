class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] ans=new int[grid.length][grid[0].length];
    

        long prd=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[i][j]=(int)(prd%12345);
                prd=(prd*grid[i][j])%12345;
            }
        }
        long sprd=1;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                ans[i][j]=(ans[i][j]*(int)sprd)%12345;
                sprd=(sprd*grid[i][j])%12345;
            }
        }

       return ans; 
    }
}