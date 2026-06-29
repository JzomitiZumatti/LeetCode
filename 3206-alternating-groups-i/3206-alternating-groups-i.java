class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int ans = 0;
        for (int i = 0; i < colors.length; i++) {
            if (i == 0) {
                if (colors[colors.length - 1] == colors[i + 1] && colors[i] != colors[i + 1]) ans++;
            } else if (i == colors.length - 1) {
                if (colors[i - 1] == colors[0] && colors[0] != colors[i]) ans++;
            } else {
                if (colors[i - 1] == colors[i + 1] && colors[i] != colors[i + 1]) ans++;
            }
        }
        return ans;
    }
}