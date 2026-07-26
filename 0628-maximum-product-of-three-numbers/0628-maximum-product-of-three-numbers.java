class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int first2=nums[0]*nums[1]*nums[nums.length-1];
        int last3=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        
        return Math.max(first2,last3);
    }
}