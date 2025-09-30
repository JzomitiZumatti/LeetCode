class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (Integer num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        int dominant = -1;
        int val = -1;

        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (val < entry.getValue()) {
                val = entry.getValue();
                dominant = entry.getKey();
            }
        }
        int f1 = 0;
        int totalDominant = val;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == dominant) {
                f1++;
            }
            int f2 = totalDominant - f1;

            if (f1 * 2 > (i + 1) && f2 * 2 > (nums.size() - i - 1)) {
                return i;
            }
        }
        return -1;
    }
}