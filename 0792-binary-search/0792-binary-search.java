class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = 0;
        int temp = 0;
        while (left <= right){
            mid = left + (right - left) / 2;
            temp = mid;
            if (nums[temp] == target) return mid;
            if (nums[temp] < target) left = mid + 1;
            if (nums[temp] > target) right = mid - 1;
        }
        return -1;
    }
}