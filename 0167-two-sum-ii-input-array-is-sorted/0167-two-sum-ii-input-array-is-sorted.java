class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int st=0;
        int l=n-1;
        int sum;
        int[] ans= new int[2];
        while(st<l){
            sum=numbers[st]+numbers[l];
            if(sum==target){
                ans[0]=st+1;
                ans[1]=l+1;
                return ans;
            }
            else if(sum<target){
                st++;
            }
            else if(sum>target){
                l--;
            }
        }
        return ans;
            

        
        
    }
}