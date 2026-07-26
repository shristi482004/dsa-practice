class Solution {
    public int maximumProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        int thirdmax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secmin=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int d=nums[i];
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
            if(d<min)
            {
                secmin=min;
                min=d;
            }
            else if(d>=min && d<secmin)
            {
                secmin=d;
            }

        }
        return Math.max(min*secmin*max,max*secmax*thirdmax);
    }
}