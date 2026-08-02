class Solution {
    public String[] createGrid(int m, int n) {
        StringBuilder str = new StringBuilder();
        String[] ans = new String[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) str.append(".");
                else if (j == n - 1) str.append(".");
                else str.append("#");
            }
            ans[i] = str.toString();
            str.setLength(0);
        }
        return ans;
    }
}