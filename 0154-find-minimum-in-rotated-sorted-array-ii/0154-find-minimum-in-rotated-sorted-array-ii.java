class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        if (nums.length > 1) {
            while (nums[start] == nums[end] && start < end) {
                end--;
            }
        }
        return binarySearch(nums, end);
    }

    private static int binarySearch(int[] nums, int high) {
        int low = 0;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}