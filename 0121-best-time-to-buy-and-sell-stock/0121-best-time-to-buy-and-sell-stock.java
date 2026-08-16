class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int MP=0;
        int MV=99999;
        int Prof;
        for(int i=0;i<n;i++){
            if(prices[i]<MV){
                MV=prices[i];
            }
            Prof=prices[i]-MV;
            if(Prof>MP){
                MP=Prof;
            }
        }
        return MP;
        

        
    }
}