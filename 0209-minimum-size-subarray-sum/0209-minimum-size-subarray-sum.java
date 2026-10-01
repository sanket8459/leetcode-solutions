class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int left=0;
        int ml=n+1;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                ml=Math.min(ml,right-left+1);
                sum-=nums[left];
                left++;
            }
            
            

        }
        if(ml==n+1){
            ml=0;
        }
        return ml;
        
    }
}