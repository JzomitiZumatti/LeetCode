class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];


        for (int i = 0; i < heights.length; i++) pacific[i][0] = true;
        for (int j = 0; j < heights[0].length; j++) pacific[0][j] = true;

        for (int i = 0; i < heights.length; i++) atlantic[i][heights[0].length-1] = true;
        for (int j = 0; j < heights[0].length; j++) atlantic[heights.length-1][j] = true;

        checkPacificNeighbors(pacific, heights);
        checkAtlanticNeighbors(atlantic, heights);

        for (int i = 0; i < atlantic.length; i++) {
            for (int j = 0; j < atlantic[i].length; j++) {
                if (atlantic[i][j] && pacific[i][j]) {
                    list.add(List.of(i,j));
                }
            }
        }
        return list;
    }

    private static void checkPacificNeighbors(boolean[][] pacific, int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean changed;
        do {
            changed = false;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (pacific[i][j]) {
                        if (i - 1 >= 0 && !pacific[i-1][j] && heights[i-1][j] >= heights[i][j]) {
                            pacific[i-1][j] = true;
                            changed = true;
                        }
                        if (i + 1 < m && !pacific[i+1][j] && heights[i+1][j] >= heights[i][j]) {
                            pacific[i+1][j] = true;
                            changed = true;
                        }
                        if (j - 1 >= 0 && !pacific[i][j-1] && heights[i][j-1] >= heights[i][j]) {
                            pacific[i][j-1] = true;
                            changed = true;
                        }
                        if (j + 1 < n && !pacific[i][j+1] && heights[i][j+1] >= heights[i][j]) {
                            pacific[i][j+1] = true;
                            changed = true;
                        }
                    }
                }
            }
        } while (changed);
    }

    private static void checkAtlanticNeighbors(boolean[][] atlantic, int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean changed;
        do {
            changed = false;
            for (int i = m-1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    if (atlantic[i][j]) {
                        if (i - 1 >= 0 && !atlantic[i-1][j] && heights[i-1][j] >= heights[i][j]) {
                            atlantic[i-1][j] = true;
                            changed = true;
                        }
                        if (i + 1 < m && !atlantic[i+1][j] && heights[i+1][j] >= heights[i][j]) {
                            atlantic[i+1][j] = true;
                            changed = true;
                        }
                        if (j - 1 >= 0 && !atlantic[i][j-1] && heights[i][j-1] >= heights[i][j]) {
                            atlantic[i][j-1] = true;
                            changed = true;
                        }
                        if (j + 1 < n && !atlantic[i][j+1] && heights[i][j+1] >= heights[i][j]) {
                            atlantic[i][j+1] = true;
                            changed = true;
                        }
                    }
                }
            }
        } while (changed);
    }
}