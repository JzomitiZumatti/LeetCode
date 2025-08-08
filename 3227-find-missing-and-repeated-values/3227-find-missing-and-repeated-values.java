class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];
        Set<Integer> numbs = new HashSet<>();
        IntStream.rangeClosed(1, grid.length * grid[0].length)
                .forEach(numbs::add);

        List<Integer> nums = new ArrayList<>();

        for (int[] ints : grid) {
            for (int anInt : ints) {
                nums.add(anInt);
                numbs.remove(anInt);
            }
        }
        res[1] = numbs.iterator().next();
        Collections.sort(nums);
        for (int i = 1; i < nums.size(); i++) {
            if (Objects.equals(nums.get(i), nums.get(i - 1))) {
                res[0] = nums.get(i);
                break;
            }
        }
        return res;
    }
}