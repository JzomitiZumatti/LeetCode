class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> w1Freq = new HashMap<>();
        Map<Character, Integer> w2Freq = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            w1Freq.put(word1.charAt(i), w1Freq.getOrDefault(word1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < word2.length(); i++) {
            w2Freq.put(word2.charAt(i), w2Freq.getOrDefault(word2.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : w1Freq.entrySet()) {
            int dif = w2Freq.containsKey(entry.getKey()) ? Math.abs(entry.getValue() - w2Freq.get(entry.getKey())) :
                    Math.abs(entry.getValue());
            if (dif > 3) return false;
        }
        for (Map.Entry<Character, Integer> entry : w2Freq.entrySet()) {
            int dif = w1Freq.containsKey(entry.getKey()) ? Math.abs(entry.getValue() - w1Freq.get(entry.getKey())) :
                    Math.abs(entry.getValue());
            if (dif > 3) return false;
        }
        return true;
    }
}