class Solution {
    public String removeStars(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '*') {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            } else {
                stringBuilder.append(s.charAt(i));
            }
            i++;
        }
        return stringBuilder.toString();
    }
}