class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                int sum = checker(sub);
                if (sum > 0) {
                    ans += sum;
                }
            }
        }
        return ans;
    }

    private static int checker(String sub) {
        int[] freq = new int[26];
        for (int i = 0; i < sub.length(); i++) {
            char c = sub.charAt(i);
            freq[c - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : freq) {
            if (j != 0) {
                min = Math.min(min, j);
                max = Math.max(max, j);
            }
        }
        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) return 0;
        return Math.abs(min - max);
    }
}