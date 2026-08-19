class Solution {
    public void dfs(char[][] board,int row,int col,boolean[][] vis) {
        vis[row][col]=true;
        int n=board.length;
        int m=board[0].length;
        int[] delro={-1,1,0,0};
        int[] delco={0,0,1,-1};

        for(int i=0;i<4;i++)
        {
           int r=row+delro[i];
           int c=col+delco[i];

           if(r>=0 && r<n && c>=0 && c<m
           && board[r][c]=='O' &&!vis[r][c])
           {
            dfs(board,r,c,vis);
           }
        }
    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis=new boolean[n][m];

        for(int i=0;i<m;i++)
        {
            if(board[0][i]=='O' && !vis[0][i])
            {
                dfs(board,0,i,vis);
            }
         if(board[n-1][i]=='O' && !vis[n-1][i])
            {
                dfs(board,n-1,i,vis);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(board[i][0]=='O' && !vis[i][0])
            {
                dfs(board,i,0,vis);
            }
             if(board[i][m-1]=='O' && !vis[i][m-1])
            {
                dfs(board,i,m-1,vis);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='O' && !vis[i][j])
                board[i][j]='X';
            }
        }

    }
}