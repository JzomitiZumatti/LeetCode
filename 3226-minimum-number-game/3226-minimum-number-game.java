class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            int min = nums[i];
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex] = temp;
            nums[i] = min;
        }

        for (int i = 1; i < nums.length; i = i + 2) {
            arr[i - 1] = nums[i];
            arr[i] = nums[i - 1];
        }

        return arr;
    }
}