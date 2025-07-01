class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (entry.getValue() > (nums.length / 2)) {
                max = entry.getKey();
            }
        }
        return max;
    }
}