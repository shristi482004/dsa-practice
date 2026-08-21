class Solution {
    public int[] merge(int[] nums,int start,int mid, int end) {
        int[] temp=new int[end-start+1];
        int left=start;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=end)
        {
            if(nums[left]<=nums[right])
            temp[k++]=nums[left++];

            else
            temp[k++]=nums[right++];
        }
        while(left<=mid)
        {
            temp[k++]=nums[left++];
        }
        while(right<=end)
        {
            temp[k++]=nums[right++];
        }
        int j=0;
        for(int i=start;i<=end;i++)
        {
            nums[i]=temp[j++];
        }

        return nums;
    }
    public void mergesort(int[] nums,int start, int end) {
        int mid=start+(end-start)/2;
        if(start>=end)
        return ;

        mergesort(nums,start,mid);
        mergesort(nums,mid+1,end);
        merge(nums,start,mid,end);

        return ;
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);

        return nums;
    }
}