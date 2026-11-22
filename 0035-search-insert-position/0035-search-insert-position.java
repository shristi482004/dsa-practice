class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
		int i = 0;
		int j = n - 1;
		int ans = -1;
		while (i <= j)
			{
			int mid = (i + (j - i)/2);
			if (nums[mid]>=target)
				{
				ans = mid;
				j = mid - 1;
			}
			
			else
				i = mid + 1;	
		}
		return ans==-1?n:ans;
    }
}