// Problem: https://leetcode.com/problems/binary-search
class Solution {
    public int search(int[] nums, int target) {
        // Time compleixity - O(log n)
        // Space compleixty - O(1)
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}