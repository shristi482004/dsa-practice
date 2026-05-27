class Solution {
    public int maxProfit(int[] prices) {
        int high=1;
        int low=0;
        int maxProfit=0;
        int profit=0;
        while(high<prices.length)
        {
            if(prices[high]<prices[low])
            {
                low=high;
                high=high+1;
            }

            else 
            {
                profit=prices[high]-prices[low];
                maxProfit=Math.max(profit,maxProfit);
                high++;
            }

        }
        return maxProfit;
    }
}