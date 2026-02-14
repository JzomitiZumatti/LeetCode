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
            char c = s.charAt(i);
            freqs[letterPos.get(c)]++;
            for (int j = i + 1; j < s.length(); j++) {
                char cc = s.charAt(j);
                freqs[letterPos.get(cc)]++;
                if (isBalanced(freqs)) size = Math.max(size, j - i + 1);
            }
        }
        return size;
    }

    private static boolean isBalanced(int[] arr) {
        Set<Integer> freqs = new HashSet<>();
        for (int i : arr) {
            if (i > 0) freqs.add(i);
            if (freqs.size() > 1) return false;
        }
        return true;
    }
}