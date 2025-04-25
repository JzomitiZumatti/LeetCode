class Solution {
    public int lengthOfLastWord(String s) {
        int result = -1;
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                result = words[i].length();
            }
        }
        return result;
    }
}