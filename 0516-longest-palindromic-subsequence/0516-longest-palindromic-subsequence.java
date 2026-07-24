class Solution {
    public int longestPalindromeSubseq(String a) {
        StringBuilder sb=new StringBuilder(a).reverse();
        String b=sb.toString();
        int n=a.length();
        int m=b.length();
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
                if(a.charAt(i-1)==b.charAt(j-1))
                t[i][j]=1+t[i-1][j-1];
                else
                t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[n][m];
    }
}