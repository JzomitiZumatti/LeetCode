class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> letterFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            letterFreq.put(s.charAt(i), letterFreq.getOrDefault(s.charAt(i), 0) + 1);
        }
        Set<Integer> freq = new HashSet<>(letterFreq.values());
        return freq.size() == 1;
    }
}