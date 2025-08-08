class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        List<Integer> nums = new ArrayList<>();
        for (int[] ints : grid) {
            for (int anInt : ints) {
                nums.add(anInt);
            }
        }
        Collections.sort(nums);
        for (int i = 1; i < nums.size(); i++) {
            if (Objects.equals(nums.get(i), nums.get(i - 1))) {
                res[0] = nums.get(i);
            } else if (nums.get(i) - nums.get(i - 1) > 1) {
                res[1] = nums.get(i - 1) + 1;
            }
        }
        if (nums.getLast() < nums.size()) {
            res[1] = nums.size();
        } else if (nums.getFirst() > 1) {
            res[1] = 1;
        }
        return res;
    }
}