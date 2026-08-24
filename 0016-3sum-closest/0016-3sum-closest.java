class Solution {
    
    public int threeSumClosest(int[] nums, int target) {
        long mindiff=Integer.MAX_VALUE;
        long ans=0;
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
        if(i>0 && nums[i]==nums[i-1])continue;

            int k=i+1;
            int l=nums.length-1;
            while(k<l)
            {
                long sum=nums[i];
                sum+=nums[k];
                sum+=nums[l];
                long diff=Math.abs(target-sum);
                if(diff<=mindiff)
                {
                    mindiff=diff;
                    ans=sum;
                }
                if(sum==target)
                {
                    return target;
                }
                else if(sum<target)
                {
                    k++;
                }
                else
                l--;
            }
            }
        return (int)ans;
    }
}