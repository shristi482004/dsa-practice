class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] rightSum=new int[nums.length];
        rightSum[nums.length-1]=0;
        int sum=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            sum+=nums[i+1];
            rightSum[i]=sum;
        }
         sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp=rightSum[i];
            rightSum[i]=(int)(Math.abs(temp-sum));
            sum+=nums[i];
        }
        return rightSum;
    }
}