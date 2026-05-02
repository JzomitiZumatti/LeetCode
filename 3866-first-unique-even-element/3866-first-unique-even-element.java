class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (numFreq.containsKey(num) && numFreq.get(num) == 1) return num;
        }
        return -1;
    }
}