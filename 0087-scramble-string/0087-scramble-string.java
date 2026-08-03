class Solution {
    HashMap<String, Boolean> map=new HashMap<>();
    public boolean solve(String a, String b) {
        String key=a+" "+b;
        if(a.equals(b))
        {
            map.put(key,true);
            return true;
        }
        if(map.containsKey(key))
        return map.get(key);

        if(a.length()<=1)
        return false;
        boolean flag=false;
        int n=a.length();
        for(int i=1;i<n;i++)
        {
            boolean cond1=solve(a.substring(0,i),b.substring(n-i)) && solve(a.substring(i),b.substring(0,n-i));

            boolean cond2=solve(a.substring(0,i),b.substring(0,i)) && solve(a.substring(i),b.substring(i));

            if(cond1 || cond2)
            {
                flag=true;
                break;
            }
        }
        map.put(key,flag);

    return flag;
    }
    public boolean isScramble(String s1, String s2) {
        if(s1.length()!=s2.length())
        return false;

        return solve(s1,s2);
    }
}