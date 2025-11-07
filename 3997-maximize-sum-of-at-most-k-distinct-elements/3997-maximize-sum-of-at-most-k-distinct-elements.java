class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        List<Integer> uni = new ArrayList<>(unique);
        Collections.sort(uni);
        System.out.println(uni);
        int length = Math.min(k, uni.size());
        int[] res = new int[length];
        int a = 0;
        if (k > uni.size()) {
            int j = 0;
            for (int i = uni.size() - 1; i >= 0; i--) {
                res[j] = uni.get(i);
                j++;
            }
        } else {
            for (int i = uni.size() - 1; i >= uni.size() - k; i--) {
                res[a] = uni.get(i);
                a++;
            }
        }
        return res;
    }
}