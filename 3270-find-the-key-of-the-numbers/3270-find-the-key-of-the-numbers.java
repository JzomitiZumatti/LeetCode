class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int[] nums = {num1, num2, num3};
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            int[] currNumArr = digitsOfNumber(nums[i]);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = currNumArr[j];
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr[0].length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length; j++) {
                min = Math.min(min, arr[j][i]);
            }
            stringBuilder.append(min);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    private static int[] digitsOfNumber(int n) {
        int[] ans = new int[4];
        int i = ans.length - 1;
        int k = 10;
        while (i > 0) {
            ans[i] = n % k;
            n /= k;
            i--;
        }
        ans[0] = n;
        return ans;
    }
}