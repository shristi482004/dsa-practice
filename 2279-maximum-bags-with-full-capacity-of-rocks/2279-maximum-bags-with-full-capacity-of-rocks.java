class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for(int i=0;i<rocks.length;i++)
        {
            rocks[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(rocks);
        int ans=0;
        for(int i=0;i<rocks.length;i++)
        {
            if(rocks[i]<=additionalRocks)
            {ans++;
            additionalRocks-=rocks[i];
            }
            if(additionalRocks<=0)
            break;
        }
        return ans;
    }
}