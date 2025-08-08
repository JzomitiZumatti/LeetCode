class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        Map<Integer, Integer> numFreq = new HashMap<>();
        int curSum = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                numFreq.put(anInt, numFreq.getOrDefault(anInt, 0) + 1);
                curSum += anInt;
            }
        }

        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (entry.getValue() > 1) {
                res[0] = entry.getKey();
            }
        }

        int realSum = 0;
        for (int i = 1; i <= grid.length * grid[0].length; i++) {
            realSum += i;
        }
        res[1] = res[0] + (realSum - curSum);
        return res;
    }
}