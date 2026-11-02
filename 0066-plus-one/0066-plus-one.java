class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        for(int j=digits.length-1;j>=0;j--)
        {
            if(digits[j]<9)
            {
                digits[j]+=1;
                return digits;
            }
            else
            {
                digits[j]+=1;
                digits[j]=digits[j]%10;
                carry=1;
            }
        }
        int[] d1=new int[digits.length+1];
        if(carry!=0)
        {
            
            d1[0]=carry;
            for(int i=0;i<digits.length;i++)
            {
                d1[i+1]=digits[i];
            }
          
        }
        return d1; 
    }
}