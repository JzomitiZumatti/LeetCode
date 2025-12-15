class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character, Integer> targetLetters = new HashMap<>();
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            targetLetters.put(c, targetLetters.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> targetLettersFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (targetLetters.containsKey(c)) {
                targetLettersFreq.put(c, targetLettersFreq.getOrDefault(c, 0) + 1);
            }
        }
        if (targetLetters.size() > targetLettersFreq.size()) return 0;
        int min = Integer.MAX_VALUE;
        for (Integer value : targetLettersFreq.values()) {
            min = Math.min(min, value);
        }
        for (Map.Entry<Character, Integer> entry : targetLettersFreq.entrySet()) {
            int a = entry.getValue() / targetLetters.get(entry.getKey());
            min = Math.min(min, a);
        }
        return min;
    }
}