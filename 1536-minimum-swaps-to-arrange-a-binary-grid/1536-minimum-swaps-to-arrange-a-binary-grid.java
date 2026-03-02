class Solution {
    public int minSwaps(int[][] grid) {
        int[] max = new int[grid.length];
        int k = 0;
        for (int[] arr : grid) {
            int maxIndex = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    maxIndex = Math.max(maxIndex, i);
                }
            }
            max[k] = maxIndex;
            k++;
        }
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            boolean isFound = false;
            for (int j = i; j < max.length; j++) {
                if (grid.length - (max[j] + 1) >= grid.length - (i + 1)) {
                    counter += j - i;
                    isFound = true;
                    while (j > i){
                        int temp = max[j];
                        max[j] = max[j - 1];
                        max[j - 1] = temp;
                        j--;
                    }
                    break;
                }
            }
            if (!isFound) return -1;
        }
        return counter;
    }
}