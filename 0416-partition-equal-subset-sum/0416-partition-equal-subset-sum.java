class Solution {
    public boolean largestsumwt(int[] stones,int sum) {
   
        boolean[][] t=new boolean[stones.length+1][sum+1];
        t[0][0]=true;
        
        for(int i=1;i<t.length;i++)
        {
            for(int j=0;j<t[0].length;j++)
            {
                if(stones[i-1]<=j)
                t[i][j]=t[i-1][j] || t[i-1][j-stones[i-1]];
                else
                t[i][j]=t[i-1][j];
            }
        }
        
        return t[stones.length][sum];
    }
    public boolean canPartition(int[] stones) {
        int sum=0;
        for(int j=0;j<stones.length;j++)
        sum+=stones[j]; 
        if((sum)%2!=0)
        return false;
        return largestsumwt(stones,(sum)/2);
        
        
    }
}