class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<intervals.length;i++)
        {
            if(ans.size()==0 || intervals[i][0]>ans.get(ans.size()-1)[1])
            {
                int[] temp=new int[2];
                temp[0]=intervals[i][0];
                temp[1]=intervals[i][1];
                ans.add(temp);
            }
            else
            {
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],intervals[i][1]);
            }
        }
        
        return ans.toArray(new int[ans.size()][]);
        
    }
}