class Solution {
    public int diagonalSum(int[][] mat) {
        boolean isOdd = mat.length % 2 != 0;
        int sum = 0;
        int i = 0;
        int j = mat.length - 1;
        if (isOdd) {
            for (int[] ints : mat) {
                if (i != j) sum += (ints[i] + ints[j]);
                else sum += ints[i];
                i++;
                j--;
            }
        } else {
            for (int[] ints : mat) {
                sum += (ints[i] + ints[j]);
                i++;
                j--;
            }
        }
        return sum;
    }
}