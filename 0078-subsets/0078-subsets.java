class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int start = 0;
        dfs(start, nums, ans, path);
        return ans;
    }

    private static void dfs(int start, int[] nums, List<List<Integer>> ans, List<Integer> path) {
        ans.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(i + 1, nums, ans, path);
            path.removeLast();
        }
    }
}