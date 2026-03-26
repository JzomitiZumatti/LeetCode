class Solution {
    public int subsetXORSum(int[] nums) {
        List<Integer> subsetsSum = new ArrayList<>();
        int start = 0;
        int currentSum = 0;
        dfs(start, nums, currentSum, subsetsSum);
        int sum = 0;
        for (Integer n : subsetsSum) {
            sum += n;
        }
        return sum;
    }

    private static void dfs(int start, int[] nums, int currentSum, List<Integer> subsetsSum) {
        subsetsSum.add(currentSum);
        for (int i = start; i < nums.length; i++) {
            dfs(i + 1, nums, currentSum ^ nums[i], subsetsSum);
        }
    }
}