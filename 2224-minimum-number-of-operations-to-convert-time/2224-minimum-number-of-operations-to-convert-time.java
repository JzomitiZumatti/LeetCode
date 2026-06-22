class Solution {
    public int convertTime(String current, String correct) {
        int ans = 0;
        int[] op = {1, 5, 15, 60};
        int curMin = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3));
        int corMin = Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3));
        if (corMin == curMin) return 0;
        for (int i = op.length - 1; i >= 0;) {
            if (corMin - op[i] >= curMin) {
                corMin -= op[i];
                ans++;
            } else i--;
        }
        return ans;
    }
}