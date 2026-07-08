class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] freq=new int[256];
        for(int i=0;i<stones.length();i++)
        {
            freq[stones.charAt(i)]++;
        }
        int ans=0;
        for(int i=0;i<jewels.length();i++)
        {
            ans+=freq[jewels.charAt(i)];
        }
        return ans;
    }
}