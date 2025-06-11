class Solution {
    public boolean predictTheWinner(int[] nums) {
        int[][] fd = new int[nums.length][nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i; j < nums.length; j++) {
                if (i == j) {
                    fd[i][j] = nums[i];
                } else {
                    fd[i][j] = Math.max(nums[i] - fd[i + 1][j], nums[j] - fd[i][j - 1]);
                }
            }
        }
        return fd[0][nums.length - 1] >= 0;
    }
}