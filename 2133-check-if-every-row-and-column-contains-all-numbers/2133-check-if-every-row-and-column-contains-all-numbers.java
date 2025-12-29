class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> ideal = new HashSet<>();
        for (int i = 1; i <= matrix.length; i++) {
            ideal.add(i);
        }
        int k = 0;
        while (k < matrix.length) {
            Set<Integer> temp = new HashSet<>();
            for (int[] ints : matrix) {
                temp.add(ints[k]);
            }
            k++;
            if (temp.size() != ideal.size()) return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            Set<Integer> temp = new HashSet<>();
            for (int j = 0; j < matrix[i].length; j++) {
                temp.add(matrix[i][j]);
            }
            if (temp.size() != ideal.size()) return false;
        }
        return true;
    }
}