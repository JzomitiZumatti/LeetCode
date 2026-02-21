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
        Map<Integer, Integer> difSize = new HashMap<>();
        for (Map.Entry<Integer, List<Integer>> entry : difLsit.entrySet()) {
            difSize.put(entry.getKey(), entry.getValue().size() - 1);
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int n =  i - j;
                grid[i][j] = difLsit.get(n).get(difSize.get(n));
                difSize.put(n, difSize.get(n) - 1);
            }
        }
        return grid;
    }
}