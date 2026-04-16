class Solution {
    public String sortString(String s) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Integer> letterFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letterFreq.put(c, letterFreq.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> incMap = new TreeMap<>(letterFreq);
        Map<Character, Integer> decMap = new TreeMap<>(Comparator.reverseOrder());
        decMap.putAll(letterFreq);
        while (!incMap.isEmpty()) {
            List<Character> incKeys = new ArrayList<>(incMap.keySet());
            for (Character c : incKeys) {
                ans.append(c);
                incMap.put(c, incMap.get(c) - 1);
                decMap.put(c, decMap.get(c) - 1);
                if (incMap.get(c) == 0) {
                    incMap.remove(c);
                    decMap.remove(c);
                }
            }
            List<Character> decKeys = new ArrayList<>(decMap.keySet());
            for (Character c : decKeys) {
                ans.append(c);
                incMap.put(c, incMap.get(c) - 1);
                decMap.put(c, decMap.get(c) - 1);
                if (decMap.get(c) == 0) {
                    incMap.remove(c);
                    decMap.remove(c);
                }
            }
        }
        return ans.toString();
    }
}