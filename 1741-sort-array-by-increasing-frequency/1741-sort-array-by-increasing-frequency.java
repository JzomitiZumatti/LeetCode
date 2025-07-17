class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> numbFreq  = new HashMap<>();
        for (int n : nums) {
            numbFreq.put(n, numbFreq.getOrDefault(n, 0) + 1);
        }
        return numbFreq.entrySet().stream()
                .sorted((e1, e2) -> {
                int valueCompare = e1.getValue().compareTo(e2.getValue());
                if (valueCompare == 0) {
                    return e2.getKey().compareTo(e1.getKey());
                }
                return valueCompare;
                })
                .flatMapToInt(entry ->IntStream.generate(entry::getKey)
                        .limit(entry.getValue()))
                .toArray();
    }
}