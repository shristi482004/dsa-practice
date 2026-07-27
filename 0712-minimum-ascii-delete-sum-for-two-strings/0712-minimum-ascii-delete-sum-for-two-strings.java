class Solution {
    public int minimumDeleteSum(String x, String y) {
        int sum=0;
        
        int[][] t=new int[x.length()+1][y.length()+1];
        int n=x.length();
        int m=y.length();
        for(int i=0;i<n;i++)
        sum+=x.charAt(i);
        for(int i=0;i<m;i++)
        sum+=y.charAt(i);
        
        for(int i=1;i<t.length;i++)
        {
            for(int j=1;j<t[0].length;j++)
            {
                if(x.charAt(i-1)==y.charAt(j-1))
                t[i][j]=Math.max(t[i-1][j],x.charAt(i-1)+t[i-1][j-1]);
                else
                 t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
            }
        }
        return sum-2*t[n][m];
    }
}