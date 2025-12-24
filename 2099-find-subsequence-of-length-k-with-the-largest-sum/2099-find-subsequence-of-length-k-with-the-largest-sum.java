class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new int[]{nums[i], i};
        }
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        int[][] subPairs = new int[k][2];
        for (int i = 0; i < k; i++) {
            subPairs[i] = Arrays.copyOfRange(pairs[pairs.length - k + i], 0, 2);
        }
        Arrays.sort(subPairs, Comparator.comparingInt(a -> a[1]));
        int[] res = new int[subPairs.length];
        for (int i = 0; i < subPairs.length; i++) {
            res[i] = subPairs[i][0];
        }
        return res;
    }
}