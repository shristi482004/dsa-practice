
class Pair
{
    int first;
    int second;
    int steps;
    public Pair(int first,int second,int steps)
    {
        this.first=first;
        this.second=second;
        this.steps=steps;
    }
}

class Solution {
    public int[][] highestPeak(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<Pair> q=new LinkedList<>();
        int[][] dist=new int[n][m];
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }
        int[] delro={-1,1,0,0};
        int[] delco={0,0,1,-1};
        while(!q.isEmpty())
        {
            int row=q.peek().first;
            int col=q.peek().second;
            int st=q.peek().steps;
            q.remove();
            dist[row][col]=st;

            for(int i=0;i<4;i++)
            {
                int r=row+delro[i];
                int c=col+delco[i];

                if(r>=0 && r<n && c>=0 && c<m
                && !vis[r][c])
                {
                    vis[r][c]=true;
                    q.add(new Pair(r,c,st+1));
                }
            }
        }
        return dist;
    }
}