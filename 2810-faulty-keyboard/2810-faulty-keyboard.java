class Solution {
    public String finalString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == 'i') stringBuilder.reverse();
            else stringBuilder.append(letter);
        }
        return stringBuilder.toString();
    }
}