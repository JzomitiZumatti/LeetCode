class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int start = 0;
        dfs(start, nums, res, path);
        return res;
    }

    private static void dfs(int start, int[] nums, List<List<Integer>> res, List<Integer> path) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            path.add(nums[i]);
            dfs(i + 1, nums, res, path);
            path.removeLast();
        }
    }
}