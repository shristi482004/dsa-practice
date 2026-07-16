class Solution {
    public boolean judgeSquareSum(int c) {

        int left=0;
        int right=(int)Math.sqrt(c);
        while(left<=right)
        {
            long sum=(long)left*left+(long)right*right;
            if(sum==(long)c)
            return true;
            else if(sum<(long)c)
            left++;
            else
            right--;
        }
        return false;
    }
}