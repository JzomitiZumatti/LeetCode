class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> repeat = new HashMap<>();
        for (int n : nums) {
            repeat.put(n, repeat.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : repeat.entrySet()) {
            if (entry.getValue() > 1) return entry.getKey();
        }
        return -1;
    }
}