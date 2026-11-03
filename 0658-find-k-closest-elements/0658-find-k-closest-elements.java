class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (b[0] == a[0]) {
                return Integer.compare(b[1], a[1]); 
            }
            return Integer.compare(b[0], a[0]);     
        }); 

        for(int i=0;i<arr.length;i++)
        {
            int dist=(int)(Math.abs(arr[i]-x));
             pq.add(new int[]{dist,arr[i]});
            if(pq.size()>k)
            pq.poll();
           
            
        }
        int it=0;
        for(int i=0;i<k;i++)
        {
            int[] temp=pq.poll();
            ans.add(temp[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}