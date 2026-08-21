class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        ArrayList<Integer> spiral=new ArrayList<>();
        int count=1;
        for(int i=0;i<n*n;i++)
        {
            spiral.add(i+1);
        }
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int k=0;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
               ans[top][i]=spiral.get(k++);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans[i][right]=spiral.get(k++);
            }
            right--;

            if(top<=bottom)
            {
               for(int i=right;i>=left;i--)
            {
                ans[bottom][i]=spiral.get(k++);
            }
            bottom--; 
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
            {
                ans[i][left]=spiral.get(k++);
            }
            left++;
            }
        }

        return ans;
    }
}