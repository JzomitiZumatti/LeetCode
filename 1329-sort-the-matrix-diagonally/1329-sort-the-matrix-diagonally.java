class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer, List<Integer>> diffDiagonal = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                diffDiagonal.putIfAbsent(i - j, new ArrayList<>());
                diffDiagonal.get(i - j).add(mat[i][j]);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : diffDiagonal.entrySet()) {
            Collections.sort(entry.getValue());
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = diffDiagonal.get(i - j).getFirst();
                diffDiagonal.get(i - j).removeFirst();
            }
        }
        return mat;
    }
}