class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int closebkts=0;
        int openbkts=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            openbkts++;
            else
            closebkts++;
            
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push('(');
                openbkts++;
            }
            else 
            {
                if(!st.isEmpty())
                {st.pop();
                closebkts--;}
            }
        }
        return st.size()+closebkts;
    }
}