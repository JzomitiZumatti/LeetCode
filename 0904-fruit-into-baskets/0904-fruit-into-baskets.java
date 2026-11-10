class Solution {
    public int totalFruit(int[] fruits) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        int left = 0;
        for (int right = 0; right < fruits.length; right++) {
            int f = fruits[right];
            set.add(f);
            if (set.size() > 2) {
                ans = Math.max(ans, right - left);
                set.remove(fruits[left]);
                int a = fruits[left];
                while (fruits[left] == a) {
                    left++;
                    if (left == fruits.length - 1) return ans;
                }
                set.clear();
                for (int i = left; i <= right; i++) {
                    set.add(fruits[i]);
                }
            }
        }
        return Math.max(ans, fruits.length - left);
    }
}