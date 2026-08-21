class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int Sum=(n*(n+1))/2;
        int Osum=0;
        for(int i=0;i<n;i++){
            Osum=Osum+nums[i];
        }
        return Sum-Osum;
    }
}