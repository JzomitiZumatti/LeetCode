class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Integer, Character> posLetter = new HashMap<>();
        Map<Character, Integer> letterFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            posLetter.put(i, s.charAt(i));
            letterFreq.put(s.charAt(i), letterFreq.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (letterFreq.size() == s.length()) return - 1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (letterFreq.get(s.charAt(i)) > 1) {
                int maxIndex = findIndex(posLetter, s.charAt(i));
                max = Math.max(max, Math.abs(i - maxIndex) - 1);
            }
        }
        return max;
    }

    private static int findIndex(Map<Integer, Character> map, char c) {
        int max = -1;
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            if (entry.getValue() == c) max = Math.max(max, entry.getKey());
        }
        return max;
    }
}