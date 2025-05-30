class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        try {
            int[][] newArr = copyAndAdd(intervals, newInterval);
            Arrays.sort(newArr, Comparator.comparingInt(a -> a[0]));
            int[] prev = newArr[0];
            for (int i = 1; i < newArr.length; i++) {
                int[] current = newArr[i];
                if (current[0] <= prev[1]) {
                    prev = new int[]{prev[0], Math.max(prev[1], current[1])};
                } else {
                    merged.add(prev);
                    prev = current;
                }
            }
            merged.add(prev);
        } catch (IndexOutOfBoundsException o) {
            merged.add(newInterval);
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static int[][] copyAndAdd(int[][] originalArray, int[] newArray) {
        int rows = originalArray.length;
        int cols = originalArray[0].length;
        int[][] newArrayWithAddition = new int[rows + 1][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(originalArray[i], 0, newArrayWithAddition[i], 0, cols);
        }
        newArrayWithAddition[rows] = newArray;
        return newArrayWithAddition;
    }
}