class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            if (isMatch(word, pattern)) ans.add(word);
        }
        return ans;
    }

    private static boolean isMatch(String word, String pattern) {
        Map<Character, Character> wordMap = new HashMap<>();
        Map<Character, Character> patMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (wordMap.containsKey(w) && wordMap.get(w) != p) return false;
            if (patMap.containsKey(p) && patMap.get(p) != w) return false;

            wordMap.put(w, p);
            patMap.put(p, w);
        }

        return true;
    }
}