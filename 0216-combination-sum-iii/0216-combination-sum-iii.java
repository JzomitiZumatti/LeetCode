class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int sum = 0;
        int start = 1;
        bt(start, sum, res, path, k, n);
        return res;
    }

    private static void bt(int start, int sum, List<List<Integer>> res, List<Integer> path, int k, int n) {
        if (path.size() == k && sum == n) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (sum + i <= n) {
                path.add(i);
                bt(i + 1, sum + i, res, path, k, n);
                path.removeLast();
            }
        }
    }
}