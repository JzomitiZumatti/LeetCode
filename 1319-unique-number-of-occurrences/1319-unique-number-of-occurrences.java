class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int a : arr) {
            d.put(a, d.getOrDefault(a, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : d.entrySet()) {
            s.add(entry.getValue());
        }

        return d.size() == s.size();
    }
}