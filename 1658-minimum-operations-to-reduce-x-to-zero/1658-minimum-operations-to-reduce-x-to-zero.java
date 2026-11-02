class Solution {
    public int minOperations(int[] nums, int x) {
        int l = 0;
        int n = nums.length;

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int target = total - x;
        int maxsum = -1;
        int sum = 0;

        for (int r = 0; r < n; r++) {
            sum += nums[r];

            while (sum > target && l <= r) {
                sum -= nums[l];
                l++;
            }

            if (sum == target) {
                maxsum = Math.max(r - l + 1, maxsum);
            }
        }

        return maxsum == -1 ? -1 : n - maxsum;
    }
}