class Solution {
    public int countWords(String[] words1, String[] words2) {
        int counter = 0;
        Map<String, Integer> word1Freq = new HashMap<>();
        Map<String, Integer> word2Freq = new HashMap<>();
        for (String s : words1) {
            word1Freq.put(s, word1Freq.getOrDefault(s, 0) + 1);
        }

        for (String s : words2) {
            word2Freq.put(s, word2Freq.getOrDefault(s, 0) + 1);
        }

        for (String s : word1Freq.keySet()) {
            if (word2Freq.containsKey(s) && (word1Freq.get(s) + word2Freq.get(s) == 2)) counter++;
        }
        return counter;
    }
}