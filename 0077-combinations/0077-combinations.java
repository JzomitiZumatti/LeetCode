class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 1; i <= n; i++) {
            nums[i - 1] = i;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int start = 0;
        int end = nums.length - 1;
        dfs(k, start, end, nums, res, path);
        return res;
    }

    private static void dfs(int k, int start, int end, int[] nums, List<List<Integer>> res, List<Integer> path) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= end; i++) {
            path.add(nums[i]);
            start++;
            dfs(k, start, end, nums, res, path);
            path.removeLast();
        }
    }
}