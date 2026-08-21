class Solution {
    public void reverseString(char[] s) {
        int l=s.length-1;
        int st=0;
        char t;
        while(st<=l){
            t=s[st];
            s[st]=s[l];
            s[l]=t;
            st++;
            l--;
        }
        
    }
}