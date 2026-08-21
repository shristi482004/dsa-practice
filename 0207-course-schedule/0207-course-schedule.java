class Solution {
    public boolean dfscycle(int node,boolean[] vis,boolean[] pathvis, ArrayList<ArrayList<Integer>> adj) {
        // code here
        vis[node]=true;
        pathvis[node]=true;
        
        for(int neighbour:adj.get(node))
        {
            if(!vis[neighbour])
            {
                if(dfscycle(neighbour,vis,pathvis,adj))
                return true;
            }
            else if(pathvis[neighbour])
            {
                return true;
            }
        }
        
        pathvis[node]=false;
        
        return false;
        
    }
   
    public boolean canFinish(int V, int[][] edges) {
        boolean[] vis=new boolean[V];
        boolean[] pathvis=new boolean[V];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<Integer>());
            
        }
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            
        }
        
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                if(dfscycle(i,vis,pathvis,adj)==true)
                return false;
            }
        }
        return true;
    }
}