class Solution {
    static int[][] t=null;
    public int solve(int[] values, int i, int j) 
    {
        if(i>=j)
        return 0;

        if(t[i][j]!=-1)
        return t[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int left=0;
            int right=0;
            if(t[i][k]!=-1)
            left=t[i][k];
            else
            left=solve(values,i,k);

            if(t[k+1][j]!=-1)
            right=t[k+1][j];
            else
            right=solve(values,k+1,j);

            int tempans=left+right+values[i-1]*values[k]*values[j];

            min=Math.min(min,tempans);
            t[i][j]=min;
        }
        

        return t[i][j];
    }
    public int minScoreTriangulation(int[] values) {
        t=new int[values.length+1][values.length+1];
        for(int i=0;i<t.length;i++)
        {
            for(int j=0;j<t[0].length;j++)
            {
                t[i][j]=-1;
            }
        }
        return solve(values,1, values.length-1);
    }
}