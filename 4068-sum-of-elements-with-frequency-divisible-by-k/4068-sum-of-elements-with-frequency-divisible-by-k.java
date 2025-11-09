class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (entry.getValue() % k == 0) sum += entry.getKey() * entry.getValue();
        }
        return sum;
    }
}