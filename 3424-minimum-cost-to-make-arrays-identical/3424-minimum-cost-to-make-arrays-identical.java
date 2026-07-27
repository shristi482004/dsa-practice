class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long cost1=0;
        for(int i=0;i<arr.length;i++)
        {
            cost1+=Math.abs(arr[i]-brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        long cost=0;
        for(int i=0;i<arr.length;i++)
        {
            cost+=Math.abs(arr[i]-brr[i]);
        }
        return Math.min(cost1,cost+k);
    }
}