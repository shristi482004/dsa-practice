class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        long ans=0;
        for(int i=0;i<n;i++)
        {
            if(n%(i+1)==0)
            {
                ans+=(long)nums[i]*nums[i];
            }
        }
        return (int)ans;
    }
}