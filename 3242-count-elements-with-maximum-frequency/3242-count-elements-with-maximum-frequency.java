class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int a : nums) {
            d.put(a, d.getOrDefault(a, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : d.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        int counter = 0;
        for (Map.Entry<Integer, Integer> entry : d.entrySet()) {
            if (entry.getValue() == max) counter++;
        }

        return max * counter;
    }
}