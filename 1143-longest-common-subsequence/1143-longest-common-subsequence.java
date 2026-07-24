class Solution {
    public int longestCommonSubsequence(String x, String y) {
        int n=x.length();
        int m=y.length();
        int[][] t=new int[n+1][m+1];
        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[0].length;j++)
            {
                if(i==0 || j==0)
                t[i][j]=0;
            }
        }
        for(int i=1;i<t.length;i++)
        {
            for(int j=1;j<t[0].length;j++)
            {
                if(x.charAt(i-1) == y.charAt(j-1))
                t[i][j]=1+t[i-1][j-1];
                else
                t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[n][m];
    }
}