class Solution {
    public int minDeletionSize(String[] strs) {
        int counter = 0;
        int i = 0;
        while (i < strs[0].length()) {
            for (int j = 1; j < strs.length; j++) {
                int a = strs[j - 1].charAt(i);
                int b = strs[j].charAt(i);
                if (a > b) {
                    counter++;
                    break;
                }
            }
            i++;
        }
        return counter;
    }
}