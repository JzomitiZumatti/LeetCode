class Solution {
    public int lengthOfLastWord(String s) {
        int result = -1;
        String[] words = s.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() > 0) {
                result = words[i].length();
                break;
            }
        }
        return result;
    }
}