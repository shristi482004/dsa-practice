class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=2*n-1;i>=0;i--)
        {
            int idx=i%n;

            while(!st.isEmpty() && st.peek()<=nums[idx])
            st.pop();
            if(i<n)
            ans[i]=st.isEmpty()?-1:st.peek();

            st.push(nums[idx]);
        }
        return ans;
    }
}