class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> ans = new HashSet<>();
        for (List<Integer> num : nums) {
            for (int i = num.getFirst(); i <= num.getLast(); i++) {
                ans.add(i);
            }
        }
        return ans.size();
    }
}