class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> {
            int diffA = a[1] - a[0];
            int diffB = b[1] - b[0];

            if (diffA != diffB) return diffB - diffA;
            else return b[1] - a[1];
        });
        int ans = 0;
        for (int i = tasks.length - 1; i >= 0; i--) {
            ans = Math.max(ans + tasks[i][0], tasks[i][1]);
        }
        return ans;
    }
}