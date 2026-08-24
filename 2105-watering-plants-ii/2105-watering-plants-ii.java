class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i=0;
        int j=plants.length-1;
        int capA=capacityA;
        int capB=capacityB;
        int times=0;
        while(i<j)
        {
            
            if(plants[i]<=capacityA)
            {
                capacityA-=plants[i];
                i++;
            }
            else
            {
                times++;
                capacityA=capA;
                capacityA-=plants[i];
                i++;
            }
            if(plants[j]<=capacityB)
            {
                capacityB-=plants[j];
                j--;
            }
            else
            {
                times++;
                capacityB=capB;
                capacityB-=plants[j];
                j--;
            }
            
        }
        if(i==j)
        {
            int maxamnt=Math.max(capacityA,capacityB);
            if(maxamnt>=plants[i])
            maxamnt-=plants[i];
            else
            times++;
            
        }
        return times;
    }
}