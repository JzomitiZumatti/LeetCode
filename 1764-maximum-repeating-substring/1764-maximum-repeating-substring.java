class Solution {
    public int maxRepeating(String sequence, String word) {
        int max = 0;
        int[] dp = new int[sequence.length()];
        Arrays.fill(dp, 0);
        for (int i = word.length() - 1; i < sequence.length(); i++) {
            if (checker(sequence, word, i - word.length() + 1, i)) {
                if (i - word.length() >= 0) dp[i] = dp[i - word.length()] + 1;
                else dp[i] = 1;
             }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    private static boolean checker(String sequence, String word, int start, int end) {
        int j = 0;
        for (int i = start; i <= end; i++) {
            if (sequence.charAt(i) == word.charAt(j)) j++;
            else return false;
        }
        return true;
    }
}