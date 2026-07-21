class Solution {
    public boolean subsetsum(int[] nums,int sum) {
        boolean[][] t=new boolean[nums.length+1][sum+1];
        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[0].length;j++)
            {
                if(i==0 && j==0)
                {
                    t[i][j]=true;
                }
                else if(i==0)
                {
                    t[i][j]=false;
                }
                else if(j==0)
                t[i][j]=true;
            }
        }
        for(int i=1;i<t.length;i++)
        {
            for(int j=1;j<t[0].length;j++)
            {
                if(nums[i-1]<=j)
                {
                    t[i][j]=t[i-1][j]||t[i-1][j-nums[i-1]];
                }
                else
                t[i][j]=t[i-1][j];
            }
        }
        return t[nums.length][sum];
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        sum+=nums[i];

        if(sum%2!=0)
        return false;

        else
        return subsetsum(nums,sum/2);
    }
}