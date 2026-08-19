class Solution {
    public void dfs(int[][] image, int sr, int sc, int color,int init,boolean[][]vis) {

        image[sr][sc]=color;
        vis[sr][sc]=true;
        int n=image.length;
        int m=image[0].length;
        int[] delro={-1,1,0,0};
        int[] delco={0,0,1,-1};
        for(int i=0;i<4;i++)
        {
            int r=sr+delro[i];
            int c=sc+delco[i];

            if(r>=0 && r<n && c>=0 && c<m
            && image[r][c]==init && !vis[r][c])
            {
                dfs(image,r,c,color,init,vis);
            }
        }
    

        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int init=image[sr][sc];
        int n=image.length;
        int m=image[0].length;
        int[][] img=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                img[i][j]=image[i][j];
            }
        }
        boolean[][] vis=new boolean[n][m];
        dfs(image,sr,sc,color,init,vis);
        return image;
        
    }
}