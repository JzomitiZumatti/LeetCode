class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] isAllowed = new boolean[nums.length];
        Arrays.fill(isAllowed, true);
        dfs(nums, res, path, isAllowed);
        return res;
    }

    private static void dfs(int[] nums, List<List<Integer>> res, List<Integer> path, boolean[] isAllowed) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i] && isAllowed[i - 1]) continue;
            if (!isAllowed[i]) continue;
            path.add(nums[i]);
            isAllowed[i] = false;
            dfs(nums, res, path, isAllowed);
            path.removeLast();
            isAllowed[i] = true;
        }
    }
}