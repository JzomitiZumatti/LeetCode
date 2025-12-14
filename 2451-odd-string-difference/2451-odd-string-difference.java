class Solution {
    public String oddString(String[] words) {
        Map<Character, Integer> letterPosition = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            letterPosition.put((char) ('a' + i), i);
        }
        Map<String, List<Integer>> wordValues = new HashMap<>();
        Map<List<Integer>, Integer> arrFreq = new HashMap<>();
        for (String word : words) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < word.length(); i++) {
                int a = letterPosition.get(word.charAt(i));
                int b = letterPosition.get(word.charAt(i - 1));
                list.add(a - b);
            }
            arrFreq.put(list, arrFreq.getOrDefault(list, 0) + 1);
            wordValues.put(word, list);
        }

        for (Map.Entry<List<Integer>, Integer> entry : arrFreq.entrySet()) {
            if (entry.getValue() == 1) {
                for (Map.Entry<String, List<Integer>> listEntry : wordValues.entrySet()) {
                    if (listEntry.getValue() == entry.getKey()) return listEntry.getKey();
                }
            }
        }
        return "null";
    }
}