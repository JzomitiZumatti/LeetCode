class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> wordPos = new HashMap<>();
        String[] words = s.split(" ");
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isDigit(word.charAt(i))) {
                    stringBuilder.append(word.charAt(i));
                } else {
                    wordPos.put(Integer.parseInt(String.valueOf(word.charAt(i))), stringBuilder.toString());
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= words.length; i++) {
            if (i < words.length) {
                stringBuilder.append(wordPos.get(i));
                stringBuilder.append(" ");
            } else stringBuilder.append(wordPos.get(i));
        }
        return stringBuilder.toString();
    }
}