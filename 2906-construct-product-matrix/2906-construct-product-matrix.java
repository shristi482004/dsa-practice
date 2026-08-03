class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int[][] ans=new int[grid.length][grid[0].length];
        long pre=1;
        long suff=1;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
               ans[i][j]=(int)(pre%12345);
               pre=(pre*grid[i][j])%12345;
            }
        }
        for(int i=grid.length-1;i>=0;i--)
        {
            for(int j=grid[0].length-1;j>=0;j--)
            {
                ans[i][j]=(int)(suff*ans[i][j])%12345;
                suff=(suff*grid[i][j])%12345;
            }
        }
        return ans;
    }
}