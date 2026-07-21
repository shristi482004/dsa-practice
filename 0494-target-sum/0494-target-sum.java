class Solution {
    public int countseqsum(int[] nums, int target) {
        int[][] t=new int[nums.length+1][target+1];
        t[0][0]=1;
        for(int i=1;i<t.length;i++)
        {
            for(int j=0;j<t[0].length;j++)
            {
                if(nums[i-1]<=j)
                t[i][j]=t[i-1][j]+t[i-1][j-nums[i-1]];
                else
                t[i][j]=t[i-1][j];
            }
        }
        return t[nums.length][target];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        sum+=nums[i];

        if(Math.abs(target)>sum)
        return 0;
        if((sum+target)%2!=0)
        return 0;

        return countseqsum(nums,(sum+target)/2);
    }
}