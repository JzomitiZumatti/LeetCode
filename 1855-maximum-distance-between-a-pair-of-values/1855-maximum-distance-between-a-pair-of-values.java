class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        for (int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            int index = binarySearch(i, nums2, n);
            if (index != -1) max = Math.max(max, index - i);
        }
        return max;
    }

    private static int binarySearch(int i, int[] arr, int target) {
        int left = i;
        int right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
        return ans;
    }
}