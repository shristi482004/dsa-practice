class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if(a.length>b.length)
        {
            return findMedianSortedArrays(b,a);
        }
        int low=0;
        int high=a.length;
        int n=a.length+b.length;
        int k=(n+1)/2;
        while(low<=high)
        {
            int mid1=low+(high-low)/2;
            int mid2=k-mid1;
            int l1=(mid1>0)?a[mid1-1]:Integer.MIN_VALUE;
            int l2=(mid2>0)?b[mid2-1]:Integer.MIN_VALUE;
            int r1=(mid1<a.length)?a[mid1]:Integer.MAX_VALUE;
            int r2=(mid2<b.length)?b[mid2]:Integer.MAX_VALUE;
            System.out.println(l1+" "+l2+" "+r1+" "+r2);
            if(l1<=r2 && l2<=r1)
            {
                if(n%2==0)
                return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                else
                return Math.max(l1,l2);
            }
            else if(l1>r2)
            {
                high=mid1-1;
            }
            else
            low=mid1+1;
        }
        return 0;
    }
}