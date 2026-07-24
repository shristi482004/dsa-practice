class Solution {
    public int minimumDeleteSum(String x, String y) {
        StringBuilder sb=new StringBuilder("");
        int n=x.length();
        int m=y.length();
        int sum=0;
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
                t[i][j]= x.charAt(i-1)+t[i-1][j-1];
                else
                t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        for(int i=0;i<n;i++)
        sum+=x.charAt(i);
        for(int i=0;i<m;i++)
        sum+=y.charAt(i);


        return sum-2*t[n][m];
    }
}