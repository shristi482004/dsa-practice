class Solution {

    public String smallestPalindrome(String s) {
        char mid=s.charAt(s.length()/2);
       char[] str=new char[s.length()/2];
        for(int i=0;i<s.length()/2;i++)
        {
            str[i]=s.charAt(i);
        }
        Arrays.sort(str);
        System.out.println(str);
        StringBuilder sb=new StringBuilder("");
        int p=str.length-1;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()/2)
            sb.append(str[i]);
            else if(i==s.length()/2 && s.length()%2==1)
            sb.append(mid);
            else if(p>=0)
            {
                sb.append(str[p]);
                p--;
            }
        }
        return sb.toString();
    }
}