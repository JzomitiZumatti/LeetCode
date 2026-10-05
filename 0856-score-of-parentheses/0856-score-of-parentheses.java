class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') depth++;
            else {
                char prev = s.charAt(i - 1);
                if (prev == '(') score += 1 << (depth - 1);
                depth--;
            }
        }
        return score;
    }
}