class Solution {
    public int distinctIntegers(int n) {
        if (n == 1) return 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n ; i++) {
            set.add(i);
        }
        return set.size();
    }
}