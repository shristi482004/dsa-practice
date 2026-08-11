class Solution {
    public int missingInteger(int[] nums) {
        long presum=nums[0];
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==1)
            {
                presum+=nums[i];
                
            }
            else
            {
                break;
            }
            
        }
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=(int)presum;i<=1275;i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }
       return max+1; 
    
    }
}