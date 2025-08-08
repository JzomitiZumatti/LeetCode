class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        List<Integer> nums = new ArrayList<>();
        int curSum = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                nums.add(anInt);
                curSum += anInt;
            }
        }
        int realSum = 0;
        for (int i = 1; i <= nums.size(); i++) {
            realSum += i;
        }
        Collections.sort(nums);
        for (int i = 1; i < nums.size(); i++) {
            if (Objects.equals(nums.get(i), nums.get(i - 1))) {
                res[0] = nums.get(i - 1);
                break;
            }
        }
        res[1] = res[0] + (realSum - curSum);
        return res;
    }
}