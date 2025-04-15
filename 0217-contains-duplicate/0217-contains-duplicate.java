class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numbs.add(nums[i]);
        }
        return nums.length != numbs.size();
    }
}