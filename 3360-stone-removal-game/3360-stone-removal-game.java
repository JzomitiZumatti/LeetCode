class Solution {
    public boolean canAliceWin(int n) {
        for (int i = 10; i > 0; i--) {
            n -= i;
            if (i % 2 == 0 && n < 0) return false;
            if (i % 2 != 0 && n < 0) return true;
        }
        return true;
    }
}