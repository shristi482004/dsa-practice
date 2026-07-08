class Solution {
    public int maximumWealth(int[][] account) {
        int max=0;
        for(int i=0;i<account.length;i++)
        {
            int sum=0;
            for(int j=0;j<account[0].length;j++)
            {
                sum+=account[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}