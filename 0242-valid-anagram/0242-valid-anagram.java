class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        } else {
            char[] sCharArr = s.toLowerCase().toCharArray();
            char[] tCharArr = t.toLowerCase().toCharArray();
            Arrays.sort(sCharArr);
            Arrays.sort(tCharArr);
            return Arrays.equals(sCharArr, tCharArr);
        }
    }
}