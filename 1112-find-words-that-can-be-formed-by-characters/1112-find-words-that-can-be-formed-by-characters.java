class Solution {
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        List<Map<Character, Integer>> l = new ArrayList<>();
        Map<Character, Integer> charsFreq = new HashMap<>();

        for (String w : words) {
            Map<Character, Integer> charFreqInWord = new HashMap<>();
            for (int i = 0; i < w.length(); i++) {
                charFreqInWord.put(w.charAt(i), charFreqInWord.getOrDefault(w.charAt(i), 0) + 1);
            }
            l.add(charFreqInWord);
        }

        for (int i = 0; i < chars.length(); i++) {
            charsFreq.put(chars.charAt(i), charsFreq.getOrDefault(chars.charAt(i), 0) + 1);
        }
        int i = 0;
        for (Map<Character, Integer> el : l) {
            int counter = 0;
            for (Map.Entry<Character, Integer> entry : el.entrySet()) {
                if (charsFreq.containsKey(entry.getKey()) && charsFreq.get(entry.getKey()) >= entry.getValue()) {
                    counter += entry.getValue();
                }
            }
            if (counter == words[i].length()) res += counter;
            i++;
        }
        return res;
    }
}