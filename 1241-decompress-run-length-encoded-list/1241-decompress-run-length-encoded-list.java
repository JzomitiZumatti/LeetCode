class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                res.add(nums[i]);
            }
        }
        return res.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}