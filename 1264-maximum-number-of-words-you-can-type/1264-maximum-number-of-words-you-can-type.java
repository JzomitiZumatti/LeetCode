class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> brokenLet = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            brokenLet.add(brokenLetters.charAt(i));
        }
        int counter = 0;
        String[] words = text.split(" ");
        for (String word : words) {
            boolean isOk = true;
            for (int i = 0; i < word.length(); i++) {
                if (brokenLet.contains(word.charAt(i))) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) counter++;
        }
        return counter;
    }
}