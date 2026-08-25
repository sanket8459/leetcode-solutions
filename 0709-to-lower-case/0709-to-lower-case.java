class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        char[] chars=new char[n];
        String ans;
        for(int i=0;i<n;i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                chars[i]=((char)((int)s.charAt(i)+32));
            }else{
                chars[i]=s.charAt(i);
            }
        }
        return new String(chars);    
    }
}