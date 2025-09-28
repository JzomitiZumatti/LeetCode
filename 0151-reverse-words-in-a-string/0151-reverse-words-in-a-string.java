class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s{1,}");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            stringBuilder.append(str[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}