class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(res, nums, path);
        return res;
    }

    private static void dfs(List<List<Integer>> res, int[] nums, List<Integer> path) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int num : nums) {
            if (!path.contains(num)) {
                path.add(num);
                dfs(res, nums, path);
                path.remove(path.size() - 1);
            }
        }
    }
}