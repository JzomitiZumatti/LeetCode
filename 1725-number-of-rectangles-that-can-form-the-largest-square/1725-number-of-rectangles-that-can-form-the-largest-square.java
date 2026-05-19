class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> numberFreq = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int[] rectangle : rectangles) {
            int min = Math.min(rectangle[0], rectangle[1]);
            max = Math.max(max, min);
            numberFreq.put(min, numberFreq.getOrDefault(min, 0) + 1);
        }
        return numberFreq.get(max);
    }
}