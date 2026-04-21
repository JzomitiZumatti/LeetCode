class Solution {
    public int minimumLength(String s) {
        int ans = 0;
        int[] freq = new int[26];
        Set<Character> unique = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i) - 'a';
            freq[ascii]++;
            unique.add(s.charAt(i));
        }
        for (Character c : unique) {
            int f = freq[c - 'a'];
            if (f < 3) ans += f;
            else if (f % 2 != 0) ans += 1;
            else ans += 2;
        }
        return ans;
    }
}