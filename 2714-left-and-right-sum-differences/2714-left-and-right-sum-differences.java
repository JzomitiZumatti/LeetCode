class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        int[] leftArr = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length & j >= 0; i++, j--) {
            int lef = Math.max(i - 1, 0);
            int rig = j + 1 < nums.length ? j + 1 : 0;
            leftArr[i] = i == 0 ? lef : leftArr[i - 1] + nums[lef];
            rightArr[j] = j == nums.length - 1 ? rig : rightArr[j + 1] + nums[rig];
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Math.abs(leftArr[i] - rightArr[i]);
        }
        return arr;
    }
}