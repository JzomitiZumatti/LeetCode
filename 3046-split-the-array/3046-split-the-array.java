class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> numberFreq = new HashMap<>();
        for (int num : nums) {
            numberFreq.put(num, numberFreq.getOrDefault(num, 0) + 1);
        }
        int unique = 0;
        for (Integer value : numberFreq.values()) {
            if (value > 2) return false;
            else if (value == 1) unique++;
        }
        return unique % 2 == 0;
    }
}