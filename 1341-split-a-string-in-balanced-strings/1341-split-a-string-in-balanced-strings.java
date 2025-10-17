class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;
        int lCounter = 0;
        int rCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') lCounter++;
            else rCounter++;
            if (lCounter == rCounter) {
                res++;
                lCounter = 0;
                rCounter = 0;
            }
        }
        return res;
    }
}