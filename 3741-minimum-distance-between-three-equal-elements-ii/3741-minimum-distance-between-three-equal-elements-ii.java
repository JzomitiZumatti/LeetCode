class Solution {
    public int minimumDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> numPos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numPos.putIfAbsent(nums[i], new ArrayList<>());
            numPos.get(nums[i]).add(i);
        }

        for (Map.Entry<Integer, List<Integer>> entry : numPos.entrySet()) {
            if (entry.getValue().size() >= 3) {
                for (int i = 2; i < entry.getValue().size(); i++) {
                    int a = entry.getValue().get(i - 2);
                    int b = entry.getValue().get(i - 1);
                    int c = entry.getValue().get(i);
                    int sum = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
                    ans = Math.min(ans, sum);
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}