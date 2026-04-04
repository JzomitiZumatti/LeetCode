class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int[] ans = new int[nums.length];
        for (int num : nums) {
            if (num < 0) neg.add(num);
            else pos.add(num);
        }
        int i = 1;
        int j = 1;
        int l = 0;
        ans[0] = pos.getFirst();
        while (i < nums.length) {
            if (ans[i - 1] < 0) {
                if (j < pos.size()) {
                    ans[i] = pos.get(j);
                    j++;
                }
            } else {
                if (l < neg.size()) {
                    ans[i] = neg.get(l);
                    l++;
                }
            }
            i++;
        }
        return ans;
    }
}