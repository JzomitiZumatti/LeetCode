class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        Arrays.sort(nums);
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                res[j] = nums[i];
                j++;
            }
            if (j == 2) break;
        }
        return res;
    }
}