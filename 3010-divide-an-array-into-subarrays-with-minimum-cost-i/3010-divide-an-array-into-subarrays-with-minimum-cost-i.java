class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];
        int pos1 = 1;
        int pos2 = 1;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                pos1 = i;
            }
        }
        sum += nums[pos1];
        min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min && i != pos1) {
                min = nums[i];
                pos2 = i;
            }
        }
        sum += nums[pos2];
        return sum;
    }
}