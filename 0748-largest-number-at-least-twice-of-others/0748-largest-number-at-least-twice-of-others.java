class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 0) {
            return - 1;
        }
        int left = 0;
        int counter = 0;
        int index = -1;
        int[] b = Arrays.copyOf(nums, nums.length);
        Arrays.sort(b);
        int max = b[b.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                index = i;
            }
        }
        while (left < b.length - 1) {
            if (b[left] * 2 <= max) {
                counter++;
            }
            left++;
        }
        return counter == nums.length - 1 ? index : -1;
    }
}