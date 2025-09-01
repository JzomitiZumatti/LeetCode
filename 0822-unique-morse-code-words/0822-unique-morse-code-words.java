class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> res = new HashSet<>();
        for (String w : words) {
            res.add(morseCode(w));
        }
        return res.size();
    }

    private static String morseCode(String word) {
        String[] keys = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append(keys[(int)word.charAt(i) - 97]);
        }
        return stringBuilder.toString();
    }
}