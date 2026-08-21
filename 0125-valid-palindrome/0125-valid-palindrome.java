class Solution {
    public boolean isPalindrome(String s) {

        int st = 0;
        int l = s.length() - 1;

        while (st < l) {

            while (st < l && !Character.isLetterOrDigit(s.charAt(st))) {
                st++;
            }

            while (st < l && !Character.isLetterOrDigit(s.charAt(l))) {
                l--;
            }

            if (Character.toLowerCase(s.charAt(st)) !=
                Character.toLowerCase(s.charAt(l))) {
                return false;
            }

            st++;
            l--;
        }

        return true;
    }
}