class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int pos = -1;
        while (k >= 0) {
            for (int i = 0; i < chalk.length; i++) {
                if (k - chalk[i] < 0) return i;
                else k -= chalk[i];
            }
        }
        return pos;
    }
}