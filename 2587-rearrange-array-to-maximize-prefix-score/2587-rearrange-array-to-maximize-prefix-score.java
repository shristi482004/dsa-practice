class Solution {
   
    public int maxScore(int[] nums) {
        long sum=0;
        int ans=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
            sum+=nums[i];
            if(sum>0)
            ans++;
        }
        return ans;
    }
}