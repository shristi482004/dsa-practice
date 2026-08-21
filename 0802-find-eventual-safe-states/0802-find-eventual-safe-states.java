class Solution {
    public boolean dfscycle(int node,boolean[] vis,boolean[] pathvis, ArrayList<ArrayList<Integer>> adj,boolean[] check) {
        // code here
        vis[node]=true;
        pathvis[node]=true;
        check[node]=false;

        for(int neighbour:adj.get(node))
        {
            if(!vis[neighbour])
            {
                if(dfscycle(neighbour,vis,pathvis,adj,check))
                return true;
            }
            else if(pathvis[neighbour])
            {
                return true;
            }
        }

        pathvis[node]=false;
        check[node]=true;

        return false;

    }

    public List<Integer> eventualSafeNodes(int[][] edges) {
        int V=edges.length;
        boolean[] vis=new boolean[V];
        boolean[] pathvis=new boolean[V];
        boolean[] check=new boolean[V];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> safe=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<Integer>());

        }
        for(int i=0;i<edges.length;i++)
        {
            for(int j=0;j<edges[i].length;j++)
            {
        
            adj.get(i).add(edges[i][j]);
            
        }

        }

        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
             boolean hascycle=dfscycle(i,vis,pathvis,adj,check);
                
            }
        }
        for(int i=0;i<V;i++)
        {
            if(check[i]==true)
            {
             safe.add(i);
                
            }
        }
        return safe;
    }
}