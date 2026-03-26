class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0;
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int start = 0;
        dfs(start, nums, r, path);
        for (List<Integer> list : r) {
            int xor = 0;
            for (Integer i : list) {
                xor ^= i;
            }
            res += xor;
        }
        return res;
    }

    private static void dfs(int start, int[] nums, List<List<Integer>> r, List<Integer> path) {
        r.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(i + 1, nums, r, path);
            path.remove(path.size() - 1);
        }
    }
}