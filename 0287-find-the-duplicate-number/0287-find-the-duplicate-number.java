class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> freqN = new HashMap<>();
        int result = 0;
        for (int n : nums) {
            freqN.put(n, freqN.getOrDefault(n, 0) + 1);
        }

        for (Integer key : freqN.keySet()) {
            if (freqN.get(key) > 1) {
                result = key;
            }
        }
        return result;
    }
}