class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedC = new HashSet<>();
        for (String s : banned) {
            bannedC.add(s.toLowerCase());
        }
        Map<String, Integer> wordFreq = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            int ascii = paragraph.charAt(i);
            if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
                stringBuilder.append(c);
            }
            else if (!stringBuilder.isEmpty()) {
                String word = stringBuilder.toString().toLowerCase();
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
                stringBuilder.setLength(0);
            }
        }
        if (!stringBuilder.isEmpty()) {
            String word = stringBuilder.toString().toLowerCase();
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }
        Map<String, Integer> sortedMapDesc = wordFreq.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        for (Map.Entry<String, Integer> entry : sortedMapDesc.entrySet()) {
            if (!bannedC.contains(entry.getKey())) return entry.getKey();
        }
        return "";
    }
}