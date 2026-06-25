class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int ans = 0;
        int i = 0;
        while (mainTank > 0) {
            i++;
            if (i == 5 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
                i = 0;
            }
            mainTank--;
            ans += 10;
        }
        return ans;
    }
}