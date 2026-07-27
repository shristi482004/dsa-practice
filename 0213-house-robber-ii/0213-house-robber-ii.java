class Solution {
    public int robbing(int[] nums) {
        if(nums.length<=2)
        return nums.length==2?Math.max(nums[0],nums[1]):nums[0];
        int[] t=new int[nums.length+1];
        t[0]=0;
        t[1]=nums[0];
        t[2]=Math.max(nums[0],nums[1]);
        for(int i=3;i<t.length;i++)
        {
            t[i]=Math.max(t[i-1],nums[i-1]+t[i-2]);
        }
        return t[nums.length];
    }
    public int rob(int[] nums) {
        if(nums.length<=2)
        return nums.length==2?Math.max(nums[0],nums[1]):nums[0];
        int part1=robbing(Arrays.copyOfRange(nums,0,nums.length-1));
        int part2=robbing(Arrays.copyOfRange(nums,1,nums.length));

        return Math.max(part1,part2);
    }
}