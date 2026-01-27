class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> evenFreq = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) evenFreq.put(num, evenFreq.getOrDefault(num, 0) + 1);
        }
        if (evenFreq.isEmpty()) return -1;
        Map<Integer, Integer> sortedMapDescending = evenFreq.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : sortedMapDescending.entrySet()) {
            if (entry.getValue() == max) {
                min = Math.min(min, entry.getKey());
            } else if (entry.getValue() > max) {
                max = entry.getValue();
                min = entry.getKey();
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}