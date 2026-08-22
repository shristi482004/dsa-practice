class Solution {
    public void dfs(int node,boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[node]=true;

        for(int neighbour:adj.get(node))
        {
            if(!vis[neighbour])
            {
                dfs(neighbour,vis,adj);
            }
        }

    }
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1)
       return -1;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        boolean[] vis=new boolean[n];
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
         for (int[] edge : connections) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v); 
            adj.get(v).add(u); 
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                count++;
                dfs(i,vis,adj);
            }
        }

       return count-1; 
    }
}