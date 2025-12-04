class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (int num : nums) {
            if (numFreq.containsKey(num + 1)) max = Math.max(max, numFreq.get(num) + numFreq.get(num + 1));
        }
        return max;
    }
}