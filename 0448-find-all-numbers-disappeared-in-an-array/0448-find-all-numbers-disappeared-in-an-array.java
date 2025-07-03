class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numbs = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            numbs.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if(!numbs.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}