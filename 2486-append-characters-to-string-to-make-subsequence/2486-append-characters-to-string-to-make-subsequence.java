class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        int n=s.length();
        int m=t.length();
        
        int ans=0;
        while(i<n && j<m)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                j++;
                
            }
            else
            {
                i++;
            }
        
        }
        while(j<m)
        {
            j++;
            ans++;
        }
        

        return ans;
    }
}