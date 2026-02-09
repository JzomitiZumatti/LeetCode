class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (!isEqualsByLetters(s, goal)) return false;
        if (s.equals(goal) && !isRepeatedLetters(s)) return false;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isPresent(c, goal)) return false;
            if (c != goal.charAt(i)) counter++;
        }
        return counter <= 2;
    }

    private static boolean isPresent(char c, String s) {
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == c) return true;
        }
        return false;
    }

    private static boolean isRepeatedLetters(String s) {
        Map<Character, Integer> sLetterFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sLetterFreq.put(c, sLetterFreq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : sLetterFreq.entrySet()) {
            if (entry.getValue() >= 2) return true;
        }
        return false;
    }

    private static boolean isEqualsByLetters(String s, String goal) {
        Map<Character, Integer> sLetterFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sLetterFreq.put(c, sLetterFreq.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> gLetterFreq = new HashMap<>();
        for (int i = 0; i < goal.length(); i++) {
            char c = goal.charAt(i);
            gLetterFreq.put(c, gLetterFreq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : sLetterFreq.entrySet()) {
            if (!gLetterFreq.containsKey(entry.getKey())) return false;
            if (gLetterFreq.containsKey(entry.getKey()) && !Objects.equals(gLetterFreq.get(entry.getKey()), entry.getValue())) return false;
        }
        return true;
    }
}