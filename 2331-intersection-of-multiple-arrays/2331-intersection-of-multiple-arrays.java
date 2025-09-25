class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int[] num : nums) {
            for (int i : num) {
                numFreq.put(i, numFreq.getOrDefault(i, 0) + 1);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (entry.getValue() == nums.length) {
                res.add(entry.getKey());
            }
        }
        Collections.sort(res);
        return res;
    }
}