class Solution {
    public int rob(int[] nums) {
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            int temp = Math.max(num1, num2 + num);
            num2 = num1;
            num1 = temp;
        }
        return num1;
    }
}