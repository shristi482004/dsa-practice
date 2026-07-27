class Solution {
    public int longestCommonSubsequence(String x, String y) {
        int[][] t=new int[x.length()+1][y.length()+1];
        int n=x.length();
        int m=y.length();
        for(int i=1;i<t.length;i++)
        {
            for(int j=1;j<t[0].length;j++)
            {
                if(x.charAt(i-1)==y.charAt(j-1))
                t[i][j]=1+t[i-1][j-1];
                else
                 t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
            }
        }
        int i=n;
        int j=m;
        StringBuilder sb=new StringBuilder("");
        while(i>0 && j>0)
        {
            if(x.charAt(i-1)==y.charAt(j-1))
            {
                sb.append(x.charAt(i-1));
                i--;
                j--;
            }
            else
            {
                if(t[i][j-1]>t[i-1][j])
                {
                    j--;
                }
                else
                {
                    i--;
                }
            }
        }
        
        return t[n][m];
    }
}