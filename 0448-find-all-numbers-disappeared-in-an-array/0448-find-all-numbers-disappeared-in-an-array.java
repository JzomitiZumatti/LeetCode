class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numbs = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbs.add(nums[i]);
            a[i] = i + 1;
        }
        int i = 0;
        while (i < a.length) {
            if (!numbs.contains(a[i])) {
                res.add(a[i]);
            }
            i++;
        }
        return res;
    }
}