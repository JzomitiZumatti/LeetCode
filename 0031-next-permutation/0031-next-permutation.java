class Solution {
    public void nextPermutation(int[] nums) {
        boolean isReverse = true;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                isReverse = false;
                int pivot = nums[i];
                int min = 101;
                int minIndex = -1;
                int[] temp = new int[nums.length - (i + 1)];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > pivot && nums[j] <= min) {
                        min = nums[j];
                        minIndex = j;
                    }
                }
                nums[i] = min;
                nums[minIndex] = pivot;
                int k = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    temp[k] = nums[j];
                    k++;
                }
                k = i + 1;
                for (int j = temp.length - 1; j >= 0; j--) {
                    nums[k] = temp[j];
                    k++;
                }
                break;
            }
        }
        if (isReverse) Arrays.sort(nums);
    }
}