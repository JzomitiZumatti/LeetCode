class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> dp = new ArrayList<>();
        dp.add(words[0]);
        int i = 1;
        while (i <= words.length - 1) {
            if (groups[i] != groups[i - 1] ) {
                dp.add(words[i]);
            }
            i++;
        }
        return dp;
    }
}