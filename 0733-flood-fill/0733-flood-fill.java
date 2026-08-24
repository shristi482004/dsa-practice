class Solution {
    public void dfs(int row,int col,int initcolor,int color,int[][] image, boolean[][] vis) {

        image[row][col]=color;
        int n=image.length;
        int m=image[0].length;
        int[] delro={-1,1,0,0};
        int[] delco={0,0,1,-1};

        for(int i=0;i<4;i++)
        {
            int r=row+delro[i];
            int c=col+delco[i];
            if(r>=0 && r<n && c>=0 && c<m
            && image[r][c]==initcolor && image[r][c]!=color)
            {
                dfs(r,c,initcolor,color,image,vis);
            }
        }
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initcol=image[sr][sc];
        int n=image.length;
        int m=image[0].length;
        boolean[][] vis=new boolean[n][m];

        dfs(sr,sc,initcol,color,image,vis);

        return image;
    }
}