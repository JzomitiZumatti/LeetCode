class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        List<Integer> df = new ArrayList<>();
        for (int n : nums) {
            addSorted(df, n * n);
        }
        int i = 0;
        for (Integer d : df) {
            res[i] = d;
            i++;
        }
        return res;
    }

    private static <T extends Comparable<T>> void addSorted(List<T> list, T element) {
        int index = Collections.binarySearch(list, element);
        if (index < 0) {
            index = -(index + 1); // Calculate the insertion point
        }
        list.add(index, element);
    }
}