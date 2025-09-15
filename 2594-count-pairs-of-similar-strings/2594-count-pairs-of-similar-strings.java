class Solution {
    public int similarPairs(String[] words) {
        int res = 0;
        List<Set<Character>> wordsChar = new ArrayList<>();
        for (String w : words) {
            Set<Character> chars = new HashSet<>();
            for (int i = 0; i < w.length(); i++) {
                chars.add(w.charAt(i));
            }
            wordsChar.add(chars);
        }

        for (int i = 0; i < wordsChar.size() - 1; i++) {
            for (int j = i + 1; j < wordsChar.size(); j++) {
                if (wordsChar.get(i).equals(wordsChar.get(j))) {
                    res++;
                }
            }
        }
        return res;
    }
}