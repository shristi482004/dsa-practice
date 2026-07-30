class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long poss1=0;
        long poss2=0;
        for( int i=0;i<arr.length;i++)
        {
           poss1+=Math.abs(arr[i]-brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        for( int i=0;i<arr.length;i++)
        {
             poss2+=Math.abs(arr[i]-brr[i]);
        }
        return Math.min(poss1,poss2+k);
    }
}