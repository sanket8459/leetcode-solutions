class Solution {
    public int hammingWeight(int n) {
        String bin=Integer.toBinaryString(n);
        int l=bin.length();
        int ans=0;
        for(int i=0;i<l;i++){
            if(bin.charAt(i)==('1')){
                ans++;
            }
        }
        return ans;
        
    }
}