class Solution {
    public int robbing(int[] nums) {
        
        if(nums.length==1)
        return nums[0];
        if(nums.length==2)
        return Math.max(nums[0],nums[1]);
        int[] dp=new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        dp[2]=Math.max(nums[0],nums[1]);
        for(int i=3;i<=nums.length;i++)
        {
            dp[i]=Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
        return dp[nums.length];
    }
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        if(nums.length==2)
        return Math.max(nums[0],nums[1]);
        int poss1=robbing(Arrays.copyOfRange(nums,0,nums.length-1));
        int poss2=robbing(Arrays.copyOfRange(nums,1,nums.length));
        return Math.max(poss1,poss2);
    }
}