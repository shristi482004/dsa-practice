class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int[] ans=new int[queries.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<queries.length;i++)
        {
            int dist=(int)(Math.abs(queries[i][0]))+(int)(Math.abs(queries[i][1]));
            pq.add(dist);
            if(pq.size()>k)
            pq.poll();

            if(pq.size()==k)
            ans[i]=pq.peek();
            else
            ans[i]=-1;
            
        }

        return ans;
    }
}