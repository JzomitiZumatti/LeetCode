class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> keysIndex = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                keysIndex.add(i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (Integer index : keysIndex) {
                if (Math.abs(i - index) <= k) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}