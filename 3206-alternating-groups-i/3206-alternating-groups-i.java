class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int ans = 0;
        for (int i = 0; i < colors.length; i++) {
            int prev = (i - 1 + colors.length) % colors.length;
            int next = (i + 1) % colors.length;
            if (colors[prev] == colors[next] && colors[i] != colors[next]) ans++;
        }
        return ans;
    }
}