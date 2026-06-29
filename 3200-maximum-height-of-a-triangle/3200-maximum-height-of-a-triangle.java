class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int min = Math.min(red, blue);
        int max = Math.max(red, blue);
        int i = 0;
        while (min >= 0 && max >= 0) {
            if (min - (i + 1) >= 0) {
                i++;
                min -= i;
            } else break;
            if (max - (i + 1) >= 0) {
                i++;
                max -= i;
            } else break;
        }
        int ans = i;
        min = Math.min(red, blue);
        max = Math.max(red, blue);
        i = 0;
        while (min >= 0 && max >= 0) {
            if (max - (i + 1) >= 0) {
                i++;
                max -= i;
            } else break;
            if (min - (i + 1) >= 0) {
                i++;
                min -= i;
            } else break;
        }
        return Math.max(ans, i);
    }
}