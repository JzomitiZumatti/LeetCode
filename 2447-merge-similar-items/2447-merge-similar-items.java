class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> numberSum = new HashMap<>();

        for (int[] ints : items1) {
            numberSum.put(ints[0], numberSum.getOrDefault(ints[0], 0) + ints[1]);
        }

        for (int[] ints : items2) {
            numberSum.put(ints[0], numberSum.getOrDefault(ints[0], 0) + ints[1]);
        }

        for (Map.Entry<Integer, Integer> entry : numberSum.entrySet()) {
            res.add(new ArrayList<>(List.of(entry.getKey(), entry.getValue())));
        }
        res.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        return res;
    }
}