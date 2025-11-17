class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        List<Character> vovelsList = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        Set<Character> vovels = new HashSet<>(vovelsList);
        int i = 0;
        for (String word : words) {
            char firstLetter = word.charAt(0);
            if (vovels.contains(firstLetter)) {
                res.append(word);
                res.append("ma");
                res.append("a".repeat(Math.max(0, i + 1)));
            } else {
                res.append(word, 1, word.length());
                res.append(firstLetter);
                res.append("ma");
                res.append("a".repeat(Math.max(0, i + 1)));
            }
            i++;
            if (i < words.length) res.append(" ");
        }
        return res.toString();
    }
}