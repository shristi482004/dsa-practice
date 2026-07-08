class Solution {
    public int maxFreqSum(String s) {
       int[] freq=new int[26];
       for(int i=0;i<s.length();i++)
       {
        freq[s.charAt(i)-'a']++;
       }
       int maxconsonant=0;
       int maxvowel=0;
       for(int i=0;i<26;i++)
       {
        if(i==0 || i==4 || i==8 || i==14 || i==20)
        {
            maxvowel=Math.max(maxvowel,freq[i]);
        }
        else
        maxconsonant=Math.max(maxconsonant,freq[i]);
       }
       return maxconsonant+maxvowel; 
    }
}