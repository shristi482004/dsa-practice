class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       int n=nums.length;
       int maxlen=1;
       int left=0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int right=0;right<n;right++){
            int c=nums[right];
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            while(freq.get(c)>k)
            {
                int d=nums[left];
                freq.put(d, freq.get(d) - 1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}