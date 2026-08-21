class Solution {
    public void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj)
    {
        vis[node]=true;
        for(int neighbour:adj.get(node))
        {
            if(!vis[neighbour])
            {
                dfs(neighbour,vis,adj);
            }
        }
    }
  
    public int findCircleNum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        
        int count=0;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean[] vis=new boolean[adj.size()];
        for(int i=0;i<n;i++)
        {
                if(!vis[i])
                {
                    count++;
                    dfs(i,vis,adj);
                }
        }
        return count;
        }
        
    }
    
