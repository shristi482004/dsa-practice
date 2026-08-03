class Solution {
     static int[][] t=new int[101][101];
    static int solve(int arr[],int i, int j) {
        // code here
        if(i>=j)
        return 0;
        
        if(t[i][j]!=-1)
        return t[i][j];
    
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int left=0;
            int right=0;
            
            if(t[i][k]!=-1)
            left=t[i][k];
            else
            left=solve(arr,i,k);
            
            if(t[k+1][j]!=-1)
            right=t[k+1][j];
            else
            right=solve(arr,k+1,j);
            
            int tempans=right+left+arr[i-1]*arr[k]*arr[j];
            
            if(tempans<ans)
            ans=tempans;
        }
        t[i][j]=ans;
        
        return t[i][j];
        
    }
    public int minScoreTriangulation(int[] arr) {
        for(int i=0;i<101;i++)
        {
            for(int j=0;j<101;j++)
            {
                t[i][j]=-1;
            }
        }
        return solve(arr,1,arr.length-1);
    }
}