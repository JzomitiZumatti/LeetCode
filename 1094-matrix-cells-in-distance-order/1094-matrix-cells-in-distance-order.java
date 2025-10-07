class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Map<int[], Integer> coordDistance = new HashMap<>();
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                int distance = Math.abs(cCenter - i) + Math.abs(rCenter - j);
                coordDistance.put(new int[]{j, i}, distance);
            }
        }
        Map<int[], Integer> sortedMap = coordDistance.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        int numRows = sortedMap.size();
        int numCols = 0;
        if (!sortedMap.isEmpty()) {
            numCols = sortedMap.keySet().iterator().next().length;
        }
        int[][] resultArray = new int[numRows][numCols];
        int rowIndex = 0;
        for (int[] key : sortedMap.keySet()) {
            System.arraycopy(key, 0, resultArray[rowIndex], 0, numCols);
            rowIndex++;
        }
        return resultArray;
    }
}