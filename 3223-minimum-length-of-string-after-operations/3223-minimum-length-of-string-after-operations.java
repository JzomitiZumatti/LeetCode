class Solution {
    public int minimumLength(String s) {
        int ans = 0;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i) - 'a';
            freq[ascii]++;
        }
        for (int f : freq) {
            if (f > 0) {
                if (f < 3) ans += f;
                else if (f % 2 != 0) ans += 1;
                else ans += 2;
            }
        }
        return ans;
    }
}