class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] ns = new int[nums.length];
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            ns[num - 1]++;
        }
        for (int i = 0; i < ns.length; i++) {
            if (ns[i] == 2) ans.add(i + 1);
        }
        return ans;
    }
}