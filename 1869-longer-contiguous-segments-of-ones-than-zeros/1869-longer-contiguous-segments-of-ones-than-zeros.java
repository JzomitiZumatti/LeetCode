class Solution {
    public boolean checkZeroOnes(String s) {
        char previous = s.charAt(0);
        int maxZero = 0;
        int maxOnes = 0;
        int currentStreak = 1;
        for (int i = 1; i < s.length(); i++) {
            if (previous == s.charAt(i)) currentStreak++;
            else {
                if (previous == '0') maxZero = Math.max(maxZero, currentStreak);
                else maxOnes = Math.max(maxOnes, currentStreak);
                previous = s.charAt(i);
                currentStreak = 1;
            }
        }
        if (previous == '0') maxZero = Math.max(maxZero, currentStreak);
        else maxOnes = Math.max(maxOnes, currentStreak);
        return maxOnes > maxZero;
    }
}