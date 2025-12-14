class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        LinkedList<Integer> seen = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        int k = 0;
        for (int num : nums) {
            if (num >= 0) {
                seen.addFirst(num);
                if (k > 0) k = 0;
            }
            else {
                k++;
                if (k <= seen.size()) ans.add(seen.get(k - 1));
                else ans.add(-1);
            }
        }
        return ans;
    }
}