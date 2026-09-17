class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxarea=0;
        while(i<j)
        {
            
            int ht=Math.min(height[i],height[j]);
            int width=j-i;

            maxarea=Math.max(maxarea,ht*width);
            if(height[i]<height[j])
            {
                i++;
            }
            else
            j--;
            
        }
        return maxarea;
    }
}