class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int n=s.length();
        char[] S=s.toCharArray();
        int st=0;
        int en=n-1;
        while(st<=en){
            if(S[st]!=S[en]){
                return false;
            }
            st++;
            en--;
        }
        return true;
        
    }
}