class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans = new int[nums.length / 3][3];
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        for (int cur : nums) {
            if (j >= 3) {
                if (Math.abs(ans[i][0] - ans[i][2]) > k) return new int[0][0];
                i++;
                j = 0;
            }
            ans[i][j] = cur;
            j++;
        }
        return Math.abs(ans[i][0] - ans[i][2]) > k ? new int[0][0] : ans;
    }
}