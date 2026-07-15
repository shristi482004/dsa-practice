class Solution {
    public int findgcd(int a,int b) {
        if(b==0)
        {
            return a;
        }
        return findgcd(b,a%b);
        }
    public int gcdOfOddEvenSums(int n) {
        int oddsum=0;
        int evensum=0;
        for(int i=1;i<=2*n;i++)
        {
            if(i%2!=0)
            {
                oddsum+=i;
            }
            else
            evensum+=i;
        }

        return findgcd(oddsum,evensum);
    }
}