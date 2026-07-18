class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i <= right; i++) {
            boolean isPresent = false;
            for (int[] range : ranges) {
                if (i >= range[0] && i <= range[1]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) return false;
        }
        return true;
    }
}