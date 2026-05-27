class Solution {
    public int maxSubArray(int[] nums) {

        int currSum=0;

        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            currSum+=nums[i];

            if(currSum<0)
            {
                currSum=0;
            }

            maxSum=Math.max(maxSum,currSum);
        }
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                c++;
            }

            max=Math.max(max,nums[i]);
            
        }

        if(c==nums.length)
        {
            return max;
        }
        
        return maxSum;
    }
}