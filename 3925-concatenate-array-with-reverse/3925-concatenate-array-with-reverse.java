class Solution {
    public void reverse(int[] nums,int start,int end) {
        while(start!=end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[i];
        }
       int c=n-1;
        for(int i=n;i<2*n;i++)
        {
            ans[i]=nums[c];
            c--;
        }
        return ans;
    }
}