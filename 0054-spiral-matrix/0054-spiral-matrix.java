class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowTop = 0;
        int rowBot = matrix.length - 1;
        int colLeft = 0;
        int colRight = matrix[0].length - 1;
        while (rowTop <= rowBot && colLeft <= colRight) {
            for (int j = colLeft; j <= colRight; j++) {
                ans.add(matrix[rowTop][j]);
            }
            rowTop++;
            for (int i = rowTop; i <= rowBot; i++) {
                ans.add(matrix[i][colRight]);
            }
            colRight--;
            if (rowTop > rowBot) break;
            for (int j = colRight; j >= colLeft; j--) {
                ans.add(matrix[rowBot][j]);
            }
            rowBot--;
            if (colLeft > colRight) break;
            for (int i = rowBot; i >= rowTop; i--) {
                ans.add(matrix[i][colLeft]);
            }
            colLeft++;
        }
        return ans;
    }
}