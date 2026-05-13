class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int start = 0;
        int sum = 0;
        dfs(candidates, target, ans, path, start, sum);
        return ans;
    }

    private static void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> path, int start, int sum) {
        if (sum == target) {
            ans.add(new ArrayList<>(path));
            return;
        }
        if (sum > target) return;
        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            dfs(candidates, target, ans, path, i, sum + candidates[i]);
            path.removeLast();
        }
    }
}