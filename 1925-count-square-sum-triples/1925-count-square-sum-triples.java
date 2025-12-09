class Solution {
    public int countTriples(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        int counter = 0;
        for (int num : nums) {
            for (int i : nums) {
                for (int j : nums) {
                    if ((num * num) + (i * i) == j * j) counter++;
                }
            }
        }
        return counter;
    }
}