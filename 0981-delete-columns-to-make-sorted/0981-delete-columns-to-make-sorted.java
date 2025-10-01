class Solution {
    public int minDeletionSize(String[] strs) {
        if (strs.length == 1) return 0;
        int counter = 0;
        int j = 0;
        while (j < strs[0].length()) {
            for (int i = 1; i < strs.length; i++) {
                int prev = strs[i - 1].charAt(j);
                int cur = strs[i].charAt(j);
                if (prev > cur) {
                    counter++;
                    break;
                }

            }
            j++;
        }
        return counter;
    }
}