class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][]=new int[n][n];
        int top=0;
        int left=0;
        int bottom=n-1;
        int right=n-1;
        int element=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<right;i++){
                mat[top][i]=element++;
            }
            for(int j=top;j<bottom;j++){
                mat[j][right]=element++;
            }
            for(int i=right;i>=left;i--){
                mat[bottom][i]=element++;
            }
            for(int j=bottom-1;j>top;j--){
                mat[j][left]=element++;
            }
            top++;
            left++;
            bottom--;
            right--;
        }
        return mat;


        
    }
}