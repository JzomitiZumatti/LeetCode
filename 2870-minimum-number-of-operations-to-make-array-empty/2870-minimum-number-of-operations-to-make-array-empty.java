class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        Map<Integer, List<Integer>> numPos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numPos.putIfAbsent(nums[i], new ArrayList<>());
            numPos.get(nums[i]).add(i);
        }
        for (List<Integer> value : numPos.values()) {
            if (value.size() == 1) return -1;
            else ans += (value.size() + 2) / 3;
        }
        return ans;
    }
}