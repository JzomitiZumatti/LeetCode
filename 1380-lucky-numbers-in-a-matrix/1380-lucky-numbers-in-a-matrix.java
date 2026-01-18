class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckies = new ArrayList<>();
        Map<Integer, Integer> numberFreq = new HashMap<>();
        int k = 0;
        while (k < matrix[0].length) {
            int max = Integer.MIN_VALUE;
            for (int[] ints : matrix) {
                max = Math.max(max, ints[k]);
            }
            numberFreq.put(max, numberFreq.getOrDefault(max, 0) + 1);
            k++;
        }
        k = 0;
        while (k < matrix.length) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[k][j]);
            }
            numberFreq.put(min, numberFreq.getOrDefault(min, 0) + 1);
            k++;
        }
        for (Map.Entry<Integer, Integer> entry : numberFreq.entrySet()) {
            if (entry.getValue() > 1) luckies.add(entry.getKey());
        }
        return luckies;
    }
}