class Solution {
    public String reversePrefix(String word, char ch) {
        if (!isExist(word, ch)) return word;
        StringBuilder prefix = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch && flag) {
                flag = false;
                ans.append(word.charAt(i));
                ans.append(prefix.reverse());
            } else if (word.charAt(i) != ch && flag) {
                prefix.append(word.charAt(i));
            } else {
                ans.append(word.charAt(i));
            }
        }
        return ans.toString();
    }
    
    private static boolean isExist(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) return true;
        }
        return false;
    }
}