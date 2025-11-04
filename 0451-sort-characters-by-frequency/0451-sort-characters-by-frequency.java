class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> letterFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            letterFreq.put(s.charAt(i), letterFreq.getOrDefault(s.charAt(i), 0) + 1);
        }
        Map<Character, Integer> sortedMap = letterFreq.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            int i = 0;
            while (i < entry.getValue()) {
                stringBuilder.append(entry.getKey());
                i++;
            }
        }
        return stringBuilder.toString();
    }
}