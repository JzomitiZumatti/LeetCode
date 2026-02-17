class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int bitwise = nums[0];
        for (int i = 1; i < nums.length; i++) {
            bitwise = bitwise | nums[i];
        }
        int counter = 0;
        for (int i = 0; i < (1 << nums.length); i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) sum = sum | nums[j];
            }
            if (sum == bitwise) counter++;
        }
        return counter;
    }
}