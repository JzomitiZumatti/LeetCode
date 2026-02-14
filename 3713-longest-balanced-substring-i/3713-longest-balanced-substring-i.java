class Solution {
    public int longestBalanced(String s) {
        int size = 1;
        Map<Character, Integer> letterPos = new HashMap<>();
        int p = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            letterPos.put(c, p);
            p++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int[] freqs = new int[26];
            int maxFreq = 0;
            int unique = 0;
            char c = s.charAt(i);
            if (freqs[letterPos.get(c)] == 0) {
                unique++;
            }
            freqs[letterPos.get(c)]++;
            maxFreq = Math.max(maxFreq, freqs[letterPos.get(c)]);
            for (int j = i + 1; j < s.length(); j++) {
                char cc = s.charAt(j);
                if (freqs[letterPos.get(cc)] == 0) {
                    unique++;
                }
                freqs[letterPos.get(cc)]++;
                maxFreq = Math.max(maxFreq, freqs[letterPos.get(cc)]);
                if (maxFreq * unique == j - i + 1) size = Math.max(size, j - i + 1);
            }
        }
        return size;
    }
}