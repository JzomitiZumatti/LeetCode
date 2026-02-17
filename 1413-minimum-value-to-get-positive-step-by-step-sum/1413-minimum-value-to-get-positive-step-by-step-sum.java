class Solution {
    public int minStartValue(int[] nums) {
        int[] arr = new int[nums.length + 1];
        arr[0] = 0;
        int min = arr[0];
        for (int i = 0; i < nums.length; i++) {
            arr[i + 1] = arr[i] + nums[i];
            min = Math.min(min, arr[i + 1]);
        }
        return 1 - min;
    }
}