class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int right = k;
        int ans = k;
        while (right <= blocks.length()) {
            int wCounter = 0;
            for (int i = left; i < right; i++) {
                char c = blocks.charAt(i);
                if (c == 'W') wCounter++;
            }
            ans = Math.min(ans, wCounter);
            left++;
            right++;
        }
        return ans;
    }
}