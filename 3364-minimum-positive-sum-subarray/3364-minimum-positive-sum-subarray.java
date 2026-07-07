class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int[] prefSum = new int[nums.size() + 1];
        prefSum[0] = 0;
        for (int i = 0; i < nums.size(); i++) {
            prefSum[i + 1] = prefSum[i] + nums.get(i);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            for (int j = 0; j < prefSum.length - i; j++) {
                int sum = prefSum[j + i] - prefSum[j];
                if (sum > 0) ans.add(sum);
            }
        }
        if (ans.isEmpty()) return -1;
        int min = Integer.MAX_VALUE;
        for (Integer an : ans) {
            min = Math.min(min, an);
        }
        return min;
    }
}