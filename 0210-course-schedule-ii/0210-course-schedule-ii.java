class Solution {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public int[] findOrder(int V, int[][] edges) {

        Queue<Integer> q=new LinkedList<>();
        int[] indegree=new int[V];
        int[] topo=new int[V];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        
        for(int i=0;i<adj.size();i++)
        {
            for(int it:adj.get(i))
            {
                indegree[it]++;
            }
        }
        for(int i=0;i<adj.size();i++)
        {
            if(indegree[i]==0)
            q.add(i);
        }
        int i=0;
        
        while(!q.isEmpty())
        {
            int node=q.peek();
            q.remove();
            topo[i++]=node;
            
            for(int it:adj.get(node))
            {
                indegree[it]--;
                if(indegree[it]==0)
                {
                    q.add(it);
                }
            }
        }

        reverseArray(topo);
        return i<V-1?new int[]{}:topo;
    }
}