class Solution {
    public int maxDistance(int[] colors) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < colors.length - 1; i++) {
            int a = colors[i];
            for (int j = colors.length - 1; j >= i + 1; j--) {
                int b = colors[j];
                if (a != b) max = Math.max(max, Math.abs(i - j));
            }
        }
        return max;
    }
}