class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int i=0;
        long num=0;
        boolean isNeg=false;
            while(i<s.length() && s.charAt(i)==' ')
            {
                i++;
            }
            if(i>=s.length())
            {
                return (int)num;
            }
            if(s.charAt(i)=='+' || s.charAt(i)=='-')
            {
                if(s.charAt(i)=='-')
                isNeg=true;
                i++;
            }
             while(i<s.length() && Character.isDigit(s.charAt(i)))
             {
                int r=s.charAt(i)-'0';
                num=num*10+r;
                if(num>=Integer.MAX_VALUE)
                return (isNeg && num*-1<=Integer.MIN_VALUE)?Integer.MIN_VALUE:(isNeg)?-1*(int)num:Integer.MAX_VALUE;
                i++;
             }

        return isNeg?-1*(int)num:(int)num;
        }
    }
    