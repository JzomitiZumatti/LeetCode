class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long min = Long.MAX_VALUE;
        long counter = 0;
        long sum = 0;
        for (int[] m : matrix) {
            for (int e : m) {
                sum += Math.abs(e);
                min = Math.min(min, Math.abs(e));
                if (e < 0) counter++;
            }
        }
        if (counter % 2 == 0) return sum;
        else return sum - (2L * min);
    }
}