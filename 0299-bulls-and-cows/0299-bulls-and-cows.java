class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] numFreq = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            int c = secret.charAt(i) - '0';
            numFreq[c]++;
        }
        for (int i = 0; i < guess.length(); i++) {
            char g = guess.charAt(i);
            char s = secret.charAt(i);
            int n = g - '0';
            if (g == s) {
                bulls++;
                numFreq[n]--;
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            char g = guess.charAt(i);
            char s = secret.charAt(i);
            int n = g - '0';
            if (g != s && numFreq[n] > 0) {
                cows++;
                numFreq[n]--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}