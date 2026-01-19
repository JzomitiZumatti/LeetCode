class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int j = 0;
        if (n % 2 == 0) {
            for (int i = -n / 2; i <= n / 2; i++) {
                if (i != 0) {
                    res[j] = i;
                    j++;
                }
            }
        } else {
            for (int i = -n / 2; i <= n / 2; i++) {
                res[j] = i;
                j++;
            }
        }
        return res;
    }
}