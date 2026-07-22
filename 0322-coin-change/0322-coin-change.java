class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] t=new int[coins.length+1][amount+1];
        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[0].length;j++)
            {
                if(i==0)
                t[i][j]=Integer.MAX_VALUE-1;
                else if(j==0)
                t[i][j]=0;
                else if(i==1)
                {
                    if(j%coins[i-1]==0)
                    {
                        t[i][j]=j/coins[i-1];
                    }
                    else
                    t[i][j]=Integer.MAX_VALUE-1;
                }
            }
        }
        for(int i=2;i<t.length;i++)
        {
            for(int j=1;j<t[0].length;j++)
            {
                if(coins[i-1]<=j)
                t[i][j]=Math.min(1+t[i][j-coins[i-1]],t[i-1][j]);
                
                else
                    t[i][j]=t[i-1][j];
                
            }
        }
        return t[coins.length][amount]==2147483646?-1:t[coins.length][amount];
    }
}