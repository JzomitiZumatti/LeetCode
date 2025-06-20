class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int maxScore = 0;
        int low = 0;
        int high = tokens.length - 1;
        Arrays.sort(tokens);
        while (low <= high) {
            if (power >= tokens[low]) {
                score++;
                power -= tokens[low];
                low++;
            } else if (score > 0) {
                score--;
                power += tokens[high];
                high--;
            } else {
                break;
            }
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}