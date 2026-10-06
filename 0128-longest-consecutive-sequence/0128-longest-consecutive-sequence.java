import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // Start counting only at the beginning of a sequence.
            if (num == Integer.MIN_VALUE || !set.contains(num - 1)) {
                int length = 1;
                int current = num;

                while (current != Integer.MAX_VALUE && set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}