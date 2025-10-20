class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetArray = alphabetString.toCharArray();
        if (sentence.length() < alphabetString.length()) return false;
        Map<Character, Boolean> isPresent = new HashMap<>();
        for (char c : alphabetArray) {
            isPresent.put(c, false);
        }
        for (int i = 0; i < sentence.length(); i++) {
            isPresent.put(sentence.charAt(i), true);
        }
        for (Boolean value : isPresent.values()) {
            if (!value) return false;
        }
        return true;
    }
}