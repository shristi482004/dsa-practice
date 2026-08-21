class Solution {
    public boolean dfscycle(int node,boolean[] vis,boolean[] pathvis, int[][] edges,boolean[] check) {
        // code here
        vis[node]=true;
        pathvis[node]=true;


        for(int neighbour:edges[node])
        {
            if(!vis[neighbour])
            {
                if(dfscycle(neighbour,vis,pathvis,edges,check))
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
       List<Integer> safe=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
             boolean hascycle=dfscycle(i,vis,pathvis,edges,check);
                
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