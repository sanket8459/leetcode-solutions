class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int st=0;
        int l=n-1;
        char t;
        while(st<l){
            t=s[st];
            s[st]=s[l];
            s[l]=t;
            st++;
            l--;
        }
        
    }
}