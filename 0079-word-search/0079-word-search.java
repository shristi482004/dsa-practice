class Solution {
    public boolean dfs(int row,int col,int ch,boolean[][] vis,char[][] board,String word) {
        if(ch==word.length()-1)
        return true;
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
            && !vis[r][c] && ch+1<word.length() && board[r][c]==word.charAt(ch+1))
            {
                if(dfs(r,c,ch+1,vis,board,word)==true)
                return true;
            }

        }
        vis[row][col]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        
        boolean[][] vis=new boolean[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(dfs(i,j,0,vis,board,word)==true)
                    return true;
                }
            }
        }
       return false; 
    }
}