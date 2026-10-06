class Solution {
    public int minAddToMakeValid(String s) {
        int res = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) {
                res++;
                balance = 0;
            }
        }
        res += balance;
        return res;
    }
}