class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lowerCase = new HashSet<>();
        Set<Character> upperCase = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            int ascii = (int) word.charAt(i);
            if (ascii >= 97 && ascii <= 122) lowerCase.add(word.charAt(i));
            else upperCase.add(word.charAt(i));
        }
        int counter = 0;
        for (Character c : lowerCase) {
            int ascii = (int) c - 32;
            if (upperCase.contains((char) ascii)) counter++;
        }
        return counter;
    }
}