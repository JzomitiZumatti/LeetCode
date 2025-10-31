class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (entry.getValue() == 2) {
                res[i] = entry.getKey();;
                i++;
            }
        }
        return res;
    }
}