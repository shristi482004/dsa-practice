class Solution {
    public double pow(double x, int n) {
        if(n==0)
        return 1;

        double half=pow(x,n/2);
        if(n%2==0)
        return half*half;

        return half*half*x;
    }
    public double myPow(double x, int n) {
        if(n<0)
        {
            n=-1*n;
            x=1/x;
        }
        return pow(x,n);
    }
}