class Solution {
    static int[][] t=new int[51][51];
    static int mcm(int arr[],int i,int j) {
        // code here
        if(i>=j)
        return 0;
        if(t[i][j]!=-1)
        {
            return t[i][j];
        }
        long min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            long tempans=mcm(arr,i,k)+mcm(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            min=Math.min(min,tempans);
        }
        t[i][j]=(int)min;
        return t[i][j];
    }
    public int minScoreTriangulation(int[] arr) {
        for(int a=0;a<t.length;a++)
        {
            for(int b=0;b<t[0].length;b++)
            {
                t[a][b]=-1;
            }
        }
        return mcm(arr,1,arr.length-1);
    }
}