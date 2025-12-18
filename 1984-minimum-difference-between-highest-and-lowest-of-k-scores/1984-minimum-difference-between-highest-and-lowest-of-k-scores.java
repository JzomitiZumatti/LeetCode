class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        Arrays.sort(nums);
        while (i + k <= nums.length) {
            int[] arr = new int[k];
            int l = 0;
            for (int j = i; j < i + k; j++) {
                arr[l] = nums[j];
                l++;
            }
            Arrays.sort(arr);
            min = Math.min(min, arr[arr.length - 1] - arr[0]);
            i++;
        }
        return min;
    }
}