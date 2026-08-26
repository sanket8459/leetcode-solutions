class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums,0,nums.length-1);
        return nums;
        
    }
    public void MergeSort(int[] arr,int low,int high){
        int mid=low+(high-low)/2;
        if(low>=high){
            return;
        } 
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1,high);
        Merge(arr,low,mid,high);

    }
    public void Merge(int[] Arr,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int[] temp=new int[high-low+1];
        int k=0;
        while(i<=mid && j<=high){
            if(Arr[i]<Arr[j]){
                temp[k]=Arr[i];
                i++;
            }else{
                temp[k]=Arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=Arr[i++];
        }
        while(j<=high){
            temp[k++]=Arr[j++];
        }
        for(int m=low;m<=high;m++){
            Arr[m]=temp[m-low];
        }
    }
}