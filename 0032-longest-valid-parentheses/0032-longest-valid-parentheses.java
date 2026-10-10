class Solution {
    public int longestValidParentheses(String s) {
        int ans = 0;
        int open = 0;
        int close = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') open++;
            else {
                close++;
                if (close > open) {
                    ans = Math.max(ans, counter);
                    counter = 0;
                    close = 0;
                    open = 0;
                }
            }
            if (close == open) {
                counter += (open + close);
                open = 0;
                close = 0;
            }
        }
        if (counter > 0) ans = Math.max(ans, counter);
        open = 0;
        close = 0;
        counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ')') close++;
            else {
                open++;
                if (open > close) {
                    ans = Math.max(ans, counter);
                    counter = 0;
                    close = 0;
                    open = 0;
                }
            }
            if (close == open) {
                counter += (open + close);
                open = 0;
                close = 0;
            }
        }
        if (counter > 0) ans = Math.max(ans, counter);
        return ans;
    }
}