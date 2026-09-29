class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        HashMap<Character,Integer>explore=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            explore.put(ch,explore.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(explore.get(ch)==1)return i;
        }
        return -1;
    }
}