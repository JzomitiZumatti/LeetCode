class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        else {
            if (nums[0] != nums[1]) return nums[0];
            if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int prev = mid == 0 ? nums.length - 1 : mid - 1;
            int next = mid == nums.length - 1 ? 0 : mid + 1;
            if (nums[prev] != nums[mid] && nums[next] != nums[mid]) return nums[mid];
            else if (mid % 2 != 0 && nums[prev] == nums[mid]) left = mid + 1;
            else if (mid % 2 != 0 && (nums[prev] != nums[mid] || nums[next] == nums[mid])) right = mid - 1;
            else if (mid % 2 == 0 && nums[next] == nums[mid]) left = mid + 1;
            else if (mid % 2 == 0 && (nums[next] != nums[mid] || nums[prev] == nums[mid])) right = mid - 1;
        }
        return nums[0];
    }
}