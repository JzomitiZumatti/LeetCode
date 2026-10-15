class Solution {
    public boolean search(int[] nums, int target) {
        return binarySearch(nums, target) >= 0;
    }

    private static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                if (arr[mid] == target) {
                    return mid;
                } else high--;
            } else {
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[low] <= arr[mid]) {
                    if (arr[low] <= target && arr[mid] >= target) high = mid - 1;
                    else low = mid + 1;
                } else if (arr[mid] <= arr[high]) {
                    if (arr[mid] <= target && arr[high] >= target) low = mid + 1;
                    else high = mid - 1;
                }
            }
        }
        return -1;
    }
}