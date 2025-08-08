class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        int curSum = 0;


        int[] freq = new int[grid.length * grid[0].length + 1];

        for (int[] ints : grid) {
            for (int anInt : ints) {
                freq[anInt]++;
                curSum += anInt;
            }
        }

        System.out.println(Arrays.toString(freq));

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                res[0] = i;
            }
        }

        int realSum = 0;
        for (int i = 1; i <= grid.length * grid[0].length; i++) {
            realSum += i;
        }
        res[1] = res[0] + (realSum - curSum);
        return res;
    }
}