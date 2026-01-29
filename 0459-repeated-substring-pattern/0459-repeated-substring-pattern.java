class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i < s.length(); i++) {
            String sub1 = s.substring(0, i);
            StringBuilder stringBuilder = new StringBuilder();
            while (stringBuilder.length() < s.length()) {
                stringBuilder.append(sub1);
            }
            if (s.contentEquals(stringBuilder)) return true;
            else stringBuilder.setLength(0);
        }
        return false;
    }
}