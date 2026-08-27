class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m+n;
        int[] ans=new int[l];
        int i=m-1;
        int j=n-1;
        int k=l-1;
        while(i>=0&&j>=0){
            
            if(nums1[i]>nums2[j]){
                ans[k]=nums1[i];
                i--;
            }else{
                ans[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            ans[k--]=nums1[i--];
        }
        while(j>=0){
            ans[k--]=nums2[j--];
        }
        for(int x=0;x<l;x++){
            nums1[x]=ans[x];
        }
        
    }
}