class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int i = 0;
        for (int x = 0, y = n; x < n && y < nums.length; x++, y++) {
            res[i] = nums[x];
            res[i + 1] = nums[y];
            i = i + 2;
        }
        return res;
    }
}