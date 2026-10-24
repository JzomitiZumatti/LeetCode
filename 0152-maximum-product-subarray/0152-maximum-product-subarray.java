class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        List<List<Integer>> dp = new ArrayList<>();
        int min = ans;
        int max = ans;
        int n = ans;
        dp.add(new ArrayList<>(List.of(min, max, n)));
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                n = nums[i];
                min = Math.min(dp.getLast().getFirst() * n, Math.min(dp.getLast().get(1) * n, dp.getLast().getLast() * n));
                max = Math.max(dp.getLast().getFirst() * n, Math.max(dp.getLast().get(1) * n, dp.getLast().getLast() * n));
                List<Integer> temp = List.of(min, max, n);
                ans = Math.max(ans, Math.max(min, Math.max(max, n)));
                dp.add(new ArrayList<>(temp));
            }
        }
        return ans;
    }
}