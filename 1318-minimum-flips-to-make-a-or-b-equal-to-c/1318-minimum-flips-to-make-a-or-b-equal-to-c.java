class Solution {
    public int minFlips(int a, int b, int c) {
       int or= a | b;
       int count=0;
       for(int i=0;i<32;i++)
       {
        int abit=(a>>i) & 1;
        int bbit=(b>>i) & 1;
        int cbit=(c>>i) & 1;
        if(abit==1 && bbit==1 && cbit==0)
        count+=2;
        else if((abit|bbit)==0 && cbit==1)
        count++;
        else if((abit|bbit)==1 && cbit==0)
        count++;
       }
       return count;
    }
}