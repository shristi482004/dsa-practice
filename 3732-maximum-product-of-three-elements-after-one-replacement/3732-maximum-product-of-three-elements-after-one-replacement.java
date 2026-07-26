class Solution {
    public long maxProduct(int[] nums) {
        long max=Long.MIN_VALUE;
        long secmax=Long.MIN_VALUE;
        long thirdmax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            long d=Math.abs(nums[i]);
            if(d>max)
            {
                thirdmax=secmax;
                secmax=max;
                max=d;
            }
            else if(d>secmax && d<=max)
            {
                thirdmax=secmax;
                secmax=d;
            }
            else if(d>thirdmax && d<=secmax && d<=max)
            {
                thirdmax=d;
               
            }

        }
        return max*secmax*100000L;
    }
}