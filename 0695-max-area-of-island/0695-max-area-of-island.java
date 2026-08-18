class Pair{
    int first;
    int second;
    public Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int bfs(int row, int col,int[][] grid,boolean[][] vis) {
        int sum=grid[row][col];
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        vis[row][col]=true;
        int n=grid.length;
        int m=grid[0].length;
        while(!q.isEmpty())
        {
            int r=q.peek().first;
            int c=q.peek().second;
            q.remove();
            int[] delro={-1,1,0,0};
            int[] delco={0,0,-1,1};
            for(int i=0;i<4;i++)
            {
                    int ro=r+delro[i];
                    int co=c+delco[i];

                    if(ro>=0 && ro<n && co>=0 && co<m
                    && grid[ro][co]!=0 && !vis[ro][co])
                    {
                        sum+=grid[ro][co];
                       vis[ro][co]=true; 
                       q.add(new Pair(ro,co));
                    }
                
            }
        }
       return sum; 
    }
    



    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]!=0 && !vis[i][j])
                {
                    int find=bfs(i,j,grid,vis);
                    max=Math.max(max,find);
                }
            }
        }
        return max;
    }
}