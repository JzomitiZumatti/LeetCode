class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int[][] res = new int[grid.length - k + 1][grid[0].length - k + 1];
        int r = 0;
        int c = 0;
        int x = 0;
        int y = 0;
        while (r + k <= grid.length && c + k <= grid[0].length) {
            int[] arr = new int[k * k];
            int l = 0;
            for (int i = r; i < r + k; i++) {
                for (int j = c; j < c + k; j++) {
                    arr[l] = grid[i][j];
                    l++;
                }
            }
            int min = Integer.MAX_VALUE;
            Arrays.sort(arr);
            int prev = arr[0];
            for (int i = 1; i < arr.length; i++) {
                int curr = arr[i];
                if (prev != curr) {
                    min = Math.min(min, Math.abs(arr[i] - arr[i - 1]));
                    prev = curr;
                }
            }
            if (min == Integer.MAX_VALUE) min = 0;
            res[x][y] = min;
            y++;
            c++;
            if (c + k > grid[0].length) {
                c = 0;
                r++;
                y = 0;
                x++;
            }
        }
        return res;
    }
}