class Solution {
    public int minimumPushes(String s) {
        int[] map=new int[26];
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            map[s.charAt(i)-'a']++;
        }

        Arrays.sort(map);
        int ans=0;
        for(int i=25;i>=0;i--)
        {
            if(map[i]>0)
            {
            if(k<8)
            {
                ans+=map[i];

            }
            else if(k>=8 && k<16)
            {
                ans+=(map[i]*2);
            }
            else if(k>=16 && k<24)
            {
                ans+=map[i]*3;
            }
            else
            ans+=map[i]*4;

            k++;
            }
        }
       
       return ans;

    }
}