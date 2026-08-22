class Solution {
    public int flip(int k){
        if(k==1){
            return 0;
        }else{
            return 1;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int[][] ans=new int[n][n];
        int k=0;
        for(int i=0;i<n;i++){
            int m=0;
            for(int j=n-1;j>=0;j--){
                ans[i][m]=flip(image[i][j]);
                m++;
            }
        }
        return ans;
    }
}