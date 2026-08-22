class Solution {
    public int maximumWealth(int[][] mat) {
        int n=mat.length;
        int max=0;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            int wealth=0;
            for(int j=0;j<m;j++){
                wealth=wealth+mat[i][j];
            }
            if(max<wealth){
                max=wealth;
            }
        }
        return max;
    }
}