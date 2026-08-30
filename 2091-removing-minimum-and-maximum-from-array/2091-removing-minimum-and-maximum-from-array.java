class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = nums.length;
        int maxIndex = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int l = nums[left];
            int r = nums[right];
            if (l < min) {
                min = l;
                minIndex = left;
            }
            if (r < min) {
                min = r;
                minIndex = right;
            }
            if (l > max) {
                max = l;
                maxIndex = left;
            }
            if (r > max) {
                max = r;
                maxIndex = right;
            }
            left++;
            right--;
        }

        int res = Math.min(
                Math.min(minIndex, maxIndex) + 1 + nums.length - Math.max(maxIndex, minIndex),
                Math.min(
                        Math.max(minIndex, maxIndex) + 1,
                        nums.length - Math.min(minIndex, maxIndex)
                )
        );
        return res;
    }
}