class Solution {
    public int findChampion(int[][] grid) {
        int champ = -1;
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            int counter = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) counter++;
            }
            if (counter > max) {
                max = counter;
                champ = i;
            }
        }
        return champ;
    }
}