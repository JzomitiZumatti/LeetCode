class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();

        for (int n : nums) {
            if (n < pivot) {
                smaller.add(n);
            } else if (n > pivot) {
                larger.add(n);
            } else {
                equal.add(n);
            }
        }

        List<Integer> sort = new ArrayList<>();

        sort.addAll(smaller);
        sort.addAll(equal);
        sort.addAll(larger);

        return sort.stream().mapToInt(i->i).toArray();
    }
}