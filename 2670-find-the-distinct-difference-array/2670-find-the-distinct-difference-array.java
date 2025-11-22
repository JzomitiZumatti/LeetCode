class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] pref = new int[nums.length];
        int[] suf = new int[nums.length];
        Set<Integer> p = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> s = new HashSet<>();
            p.add(nums[i]);
            pref[i] = p.size();
            for (int j = i + 1; j < nums.length; j++) {
                s.add(nums[j]);
            }
            suf[i] = s.size();
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = pref[i] - suf[i];
        }
        return res;
    }
}