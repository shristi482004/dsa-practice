class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        sum+=nums[i];
        int[] t=new int[nums.length];
        t[0]=nums[0];
        t[1]=Math.max(nums[1],nums[0]);
        for(int i=2;i<t.length;i++)
        {
           t[i]=Math.max(t[i-1],nums[i]+t[i-2]);
            
        }
        return t[nums.length-1];
    }
}