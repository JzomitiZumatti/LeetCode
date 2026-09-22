class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        Map<Integer, Integer> freqFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        for (Integer value : numFreq.values()) {
            freqFreq.put(value, freqFreq.getOrDefault(value, 0) + 1);
        }
        for (int num : nums) {
            if (freqFreq.get(numFreq.get(num)) == 1) return num;
        }
        return -1;
    }
}