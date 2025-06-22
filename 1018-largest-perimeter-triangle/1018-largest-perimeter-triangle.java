class Solution {
    public int largestPerimeter(int[] nums) {
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Collections.reverseOrder());
        int[] sorted = Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < sorted.length - 2; i++) {
            int a = sorted[i];
            int b = sorted[i + 1];
            int c = sorted[i + 2];
            if (b + c > a) {
                return a + b + c;
            }
        }
        return 0;
    }
}