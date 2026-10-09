class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int balance = 0;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(') {
                if (balance % 2 != 0) {
                    ans++;
                    balance--;
                }
                balance += 2;
            }
            else {
                balance--;
                if (balance < 0) {
                    ans++;
                    balance += 2;
                }
            }
            i++;
        }
        ans += balance;
        return ans;
    }
}