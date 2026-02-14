class Solution {
    public int longestBalanced(String s) {
        int size = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            int[] freqs = new int[26];
            int maxFreq = 0;
            int unique = 0;
            int posI = s.charAt(i) - 'a';
            if (freqs[posI] == 0) {
                unique++;
            }
            freqs[posI]++;
            maxFreq = Math.max(maxFreq, freqs[posI]);
            for (int j = i + 1; j < s.length(); j++) {
                int posJ = s.charAt(j) - 'a';
                if (freqs[posJ] == 0) {
                    unique++;
                }
                freqs[posJ]++;
                maxFreq = Math.max(maxFreq, freqs[posJ]);
                if (maxFreq * unique == j - i + 1) size = Math.max(size, j - i + 1);
            }
        }
        return size;
    }
}