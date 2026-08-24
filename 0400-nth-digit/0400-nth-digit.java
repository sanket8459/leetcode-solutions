class Solution {
    public int findNthDigit(int n) {

        int digits = 1;
        long count = 9;
        int start = 1;

        // Find which digit-length group contains n
        while (n > digits * count) {
            n -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }

        // Find the actual number
        int num = start + (n - 1) / digits;

        // Find the digit inside that number
        int index = (n - 1) % digits;

        return String.valueOf(num).charAt(index) - '0';
    }
}