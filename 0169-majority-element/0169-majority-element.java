class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       if(n==1) return nums[0];
       int count=1;
       for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                
                count++;
                if(count>(n/2)){
                    return nums[i];
                }
            }
            else count=1;
       }
        return 0;
    }
}