class Solution {
    public int expand(String s,int left,int right) {
        
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {left--;
        right++;}
            
        return right-left;
    }
    public String longestPalindrome(String s) {
        int i=0;
        int n=s.length();
        int maxlen=0;
        int start=-1;
        int end=-1;
        while(i<n)
        {
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            int len=Math.max(len1,len2);
            if(len>maxlen)
            {
                maxlen=len;
                start=(i-(maxlen)/2)+1;
                end=start+maxlen;
            }
            i++;
        }

        return s.substring(start,end-1);
    }
}