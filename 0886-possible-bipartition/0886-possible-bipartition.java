class Solution {
    public boolean check(ArrayList<ArrayList<Integer>> adj,int[] color, int node,int col)
    {
    color[node]=col;

  for(int neighbour:adj.get(node))
        {
            if(color[neighbour]==-1)
            {
                if(check(adj,color,neighbour,1-col)==false)
                return false;
            }
            else if(color[neighbour]==col)
            return false;
      }
    
    return true;
    }
    public boolean possibleBipartition(int n, int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<graph.length;i++)
        {
            int u=graph[i][0]-1;
            int v=graph[i][1]-1;
           
            adj.get(u).add(v);
            adj.get(v).add(u);
           
        }
        int[] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++)
        {
            if(color[i]==-1)
            {
                if(check(adj,color,i,0)==false)
                return false;
            }
        }
    


        return true;
    }
}