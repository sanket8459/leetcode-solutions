class Solution {
    public boolean isVowel(char ch){
         return ch == 'a' || ch == 'e' || ch == 'i' ||
           ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        int count=0;
        
        char[] Arr=s.toCharArray();
        int left=0;
        int right=k-1;
        for(int i=0;i<k;i++){
            if(isVowel(Arr[i])){
                count++;
            }
        }
        int max=count;
        while(right<n-1){
            
            if(isVowel(Arr[left])){
                count--;
                left++;
            }else{
                left++;
            }
            right++;
            if(isVowel(Arr[right])){
                count++;
               
            }
            if(count>max){
                max=count;
            }
        }
        return max;
        
    }
}