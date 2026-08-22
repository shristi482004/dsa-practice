class Pair{
    int first;
    int dep;

    public Pair(int first,int dep)
    {
        this.first=first;
        this.dep=dep;
    }
}


class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        Queue<Pair> q=new LinkedList<>();
        int[] d=new int[nums.length];
        boolean[] vis=new boolean[nums.length];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i=1;i<parent.length;i++) {
            int u = i;
            int v = parent[i];

            adj.get(u).add(v); 
            adj.get(v).add(u); 
        }
        q.add(new Pair(0,1));
        vis[0]=true;
     
        int h=0;
        while(!q.isEmpty())
        {
            int node=q.peek().first;
            int dep=q.peek().dep;
            d[node]=dep;
            vis[node]=true;
            h=Math.max(h,dep);
            q.remove();
            
            for(int it:adj.get(node))
            {
            if(!vis[it])
                {
                    vis[it]=true;
                    q.add(new Pair(it,dep+1));
                }
            }
        }
       
        long sum=0;

        for(int i=0;i<nums.length;i++)
        {

            sum+=(long)nums[i]*(h-d[i]+1);
        }
        return sum;
    }
}