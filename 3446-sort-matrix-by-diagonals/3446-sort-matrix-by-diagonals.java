class Solution {
    public int[][] sortMatrix(int[][] grid) {
        Map<Integer, List<Integer>> difLsit = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                difLsit.computeIfAbsent(i - j, k -> new ArrayList<>()).add(grid[i][j]);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : difLsit.entrySet()) {
            if (entry.getKey() >= 0) entry.getValue().sort(Comparator.naturalOrder());
            else entry.getValue().sort(Comparator.reverseOrder());
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int n =  i - j;
                List<Integer> list = difLsit.get(n);
                grid[i][j] = list.removeLast();
            }
        }
        return grid;
    }
}