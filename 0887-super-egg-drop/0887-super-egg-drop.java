class Solution {
    static int[][] t=new int[101][10001];
    public int solve(int e, int f) {
        if(f==0 || f==1)
        return f;
        if(e==1)
        return f;

        if(t[e][f]!=-1)
        return t[e][f];

        int min=Integer.MAX_VALUE;
    int l=1,r=f;
    while(l<=r)
    {
        int mid=(l+r)/2;
        int left=0;
        int right=0;
        if(t[e-1][mid-1]!=-1)
        left=t[e-1][mid-1];
        else
        left=solve(e-1,mid-1);

        if(t[e][f-mid]!=-1)
        right=t[e][f-mid];
        else
        right=solve(e,f-mid);

        int temp = 1 + Math.max(left,right);
        if(left<right)
        {
            l=mid+1;
        }
        else
        {
            r=mid-1;
        }
        min = Math.min(min,temp);
    }
        t[e][f]=min;

        return t[e][f];
    }
    public int superEggDrop(int k, int n) {
        for(int i=0;i<101;i++)
        {
            for(int j=0;j<10001;j++)
            {
                t[i][j]=-1;
            }
        }
        return solve(k,n);
    }
}