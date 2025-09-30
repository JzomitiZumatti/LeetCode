class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }

        int pairsCounter = 0;
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (entry.getValue() >= 2) pairsCounter += entry.getValue() / 2;
        }
        int numsWithoutPair = nums.length - (pairsCounter * 2);
        return new int[]{pairsCounter, numsWithoutPair};
    }
}