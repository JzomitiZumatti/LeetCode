class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(k, nums, res, path);
        return res;
    }

    private static void dfs(int k, int[] nums, List<List<Integer>> res, List<Integer> path) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int num : nums) {
            if (!path.isEmpty() && num < path.getLast()) continue;
            if (!path.contains(num)) {
                path.add(num);
                dfs(k, nums, res, path);
                path.removeLast();
            }
        }
    }
}