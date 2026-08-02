class Solution {
    public boolean stoneGame(int[] piles) {
        int alice=0;
        int bob=0;
        Arrays.sort(piles);
        int j=piles.length-1;
        int i=0;
        int turn=1;
        while(i<j)
        {
            if(piles[j]>=piles[i])
            {
                if(turn%2==1)
                alice+=piles[j];
                else
                bob+=piles[j];
                j--;
            }
            else
            {
                if(turn%2==1)
                alice+=piles[i];
                else
                bob+=piles[i];
                i--;
            }

        }
        
        return true;
    }
}