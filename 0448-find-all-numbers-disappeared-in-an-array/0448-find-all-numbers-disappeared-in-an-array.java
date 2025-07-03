class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> nu = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            nu.add(i + 1);
        }
        for (int n : nums) {
            nu.remove(n);
        }
        return new ArrayList<>(nu);
    }
}