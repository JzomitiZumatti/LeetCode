class Solution {
    public int[] findColumnWidth(int[][] grid) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (i < grid[0].length) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(String.valueOf(grid[j][i]).length(), max);
            }
            res.add(max);
            i++;
        }
        return res.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}