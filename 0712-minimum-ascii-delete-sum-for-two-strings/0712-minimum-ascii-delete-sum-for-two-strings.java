class Solution {
    public int minimumDeleteSum(String x, String y) {
        StringBuilder sb=new StringBuilder("");
        int n=x.length();
        int m=y.length();
        int ans=0;
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
        int i=n;
        int j=m;
        
        while(i>0 && j>0)
        {
            if(x.charAt(i-1) == y.charAt(j-1))
            {
                
                i--;
                j--;
            }
            else
            {
                if(t[i-1][j]>t[i][j-1])
                {
                    ans+=x.charAt(i-1);
                    System.out.println(x.charAt(i-1));
                    i--;
                }
                
                else
                {
                 ans+=y.charAt(j-1);
                 System.out.println(y.charAt(j-1));
                 j--;
                }

               
            }
        }
        while(i>0)
        {   ans+=x.charAt(i-1);
            i--;
        }
        while(j>0)
        {
           ans+=y.charAt(j-1);
            j--;
        }

        return ans;
    }
}