class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int cap=capacity;
        int steps=0;
        int n=plants.length;
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i]<=capacity)
            {
                capacity-=plants[i];
                steps+=1;
            }
            else
            {
                steps+=i;
                capacity=cap;
                steps+=(i+1);
                capacity-=plants[i];
            }
        }
        return steps;
    }
}