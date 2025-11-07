class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> rowSoldiers = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            rowSoldiers.put(i, sum);
        }
        Map<Integer, Integer> sortedMap = rowSoldiers.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        int[] res = new int[k];
        int i = 0;
        for (Integer key : sortedMap.keySet()) {
            if (i < k) res[i] = key;
            i++;
        }
        return res;
    }
}