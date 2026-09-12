class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        set.add(num);
        int maxlen=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]-1))
            {
                int x=nums[i];
                int len=1;
                while(set.contains(x+1))
                {
                    len++;
                    set.remove(x);
                    x=x+1;
                }
                maxlen=Math.max(len,maxlen);
            }
        }
        return maxlen;
    }
}