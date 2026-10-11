class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int start = 0;
        int sum = 0;
        backtrack(candidates, target, start, sum, path, ans);
        return ans;
    }

    private static void backtrack(int[] candidates, int target, int start, int sum,  List<Integer> path, List<List<Integer>> ans) {
        if (sum == target) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            int n = candidates[i];
            if (sum + n > target) break;
            if (i > start && n == candidates[i - 1]) continue;
            path.add(n);
            backtrack(candidates, target, i + 1, sum + n, path, ans);
            path.removeLast();
        }
    }
}