class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n<=8)
        return word.length();
        int ans=0;
        int i=1;
        while(n>=8)
        {
            ans+=8*i;
            n-=8;
            i++;
        
        }
        ans+=(n*i);
        return ans;
        
    }
}