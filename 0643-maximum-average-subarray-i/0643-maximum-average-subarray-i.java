class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // First window: indexes 0 to k - 1
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        int left = 0;
        int right = k - 1;

        while (right < nums.length - 1) {

            // Remove the old left number first
            sum -= nums[left];
            left++;

            // Add the new right number
            right++;
            sum += nums[right];

            if (sum > max) {
                max = sum;
            }
        }

        return (double) max / k;
    }
}