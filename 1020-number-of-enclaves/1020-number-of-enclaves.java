class Solution {
    public void dfs(int row,int col,boolean[][] vis,int[][] board) {
        vis[row][col]=true;
        board[row][col]=0;
        int n=board.length;
        int m=board[0].length;
        int[] delro={-1,1,0,0};
        int[] delco={0,0,1,-1};

        for(int i=0;i<4;i++)
        {
            int r=row+delro[i];
            int c=col+delco[i];

            if(r>=0 && r<n && c>=0 && c<m
            && !vis[r][c] && board[r][c]==1)
            {
                dfs(r,c,vis,board);
            }
        }
    }
    public int numEnclaves(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis=new boolean[n][m];

        for(int i=0;i<m;i++)
        {
            
            if(board[0][i]==1)
            {
                dfs(0,i,vis,board);
            }
            if(board[n-1][i]==1)
            {
                dfs(n-1,i,vis,board);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(board[i][0]==1)
            {
                dfs(i,0,vis,board);
            }
            if(board[i][m-1]==1)
            {
                dfs(i,m-1,vis,board);
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!vis[i][j] && board[i][j]==1)
                count++;
            }
        }

        return count;
    }
}