class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder sb=new StringBuilder("");
        char c=(char)('0'+digit);
        for(int i=0;i<nums.length;i++)
        {
            sb.append(Integer.toString(nums[i]));
        }
        int count=0;
        for(int i=0;i<sb.toString().length();i++)
        {
            if(sb.charAt(i)==c)
            count++;
        }
        return count;
    }
}