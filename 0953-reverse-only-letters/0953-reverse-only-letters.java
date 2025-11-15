class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> str = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90 || s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                stringBuilder.append(s.charAt(i));
                str.add(s.charAt(i));
            }
        }
        stringBuilder.reverse();
        StringBuilder stringBuilder1 = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (str.contains(s.charAt(i))) {
                stringBuilder1.append(stringBuilder.charAt(j));
                j++;
            } else stringBuilder1.append(s.charAt(i));
        }
        return stringBuilder1.toString();
    }
}