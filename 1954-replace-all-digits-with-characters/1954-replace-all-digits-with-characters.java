class Solution {
    public String replaceDigits(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            } else {
                int newChar = (int) s.charAt(i - 1) + Character.getNumericValue(s.charAt(i));
                stringBuilder.append((char) newChar);
            }
        }
        return stringBuilder.toString();
    }
}