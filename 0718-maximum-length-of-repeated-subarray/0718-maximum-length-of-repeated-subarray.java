class Solution {
    public int findLength(int[] x, int[] y) {
        int n=x.length;
        int m=y.length;
        int[][] t=new int[n+1][m+1];
        int max=0;
        for(int i=1;i<t.length;i++)
        {
            for(int j=1;j<t[0].length;j++)
            {
                if(x[i-1]==y[j-1])
                t[i][j]=1+t[i-1][j-1];
                else
                t[i][j]=0;
                max=Math.max(t[i][j],max);
            }
            
        }

        return max;
    }
}