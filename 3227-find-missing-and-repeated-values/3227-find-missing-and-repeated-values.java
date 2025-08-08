class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        int curSum = 0;
        int realSum = 0;


        int[] freq = new int[grid.length * grid[0].length + 1];

        for (int[] ints : grid) {
            for (int anInt : ints) {
                freq[anInt]++;
                curSum += anInt;
            }
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                res[0] = i;
            }
            realSum += i;
        }
        
        res[1] = res[0] + (realSum - curSum);
        return res;
    }
}