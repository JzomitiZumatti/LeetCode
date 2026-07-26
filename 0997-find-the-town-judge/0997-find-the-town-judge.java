class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] arr = new int[n][2];
        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];
            arr[a - 1][0]++;
            arr[b - 1][1]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0 && arr[i][1] == n - 1) return i + 1;
        }
        return -1;
    }
}