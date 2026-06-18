class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            boolean passed = true;
            int[] arr = new int[nums.length - 1];
            int k = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    arr[k] = nums[j];
                    k++;
                }
            }
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] >= arr[j]) {
                    passed = false;
                    break;
                }
            }
            if (passed) return true;
            i++;
        }
        return false;
    }
}