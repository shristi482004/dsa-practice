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
    public boolean isBipartite(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<graph.length;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<graph.length;i++)
        {
           for(int j=0;j<graph[i].length;j++)
           {
            adj.get(i).add(graph[i][j]);
           }
        }
        int[] color=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++)
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