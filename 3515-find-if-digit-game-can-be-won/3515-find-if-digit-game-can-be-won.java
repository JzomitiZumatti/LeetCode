class Solution {
    public boolean canAliceWin(int[] nums) {
        int fS = 0;int tS = 0;
        for (int n : nums) {
            if (n / 10 == 0) {
                fS += n;
            } else {
                tS += n;
            }
        }
        return fS > tS || tS > fS;
    }
}