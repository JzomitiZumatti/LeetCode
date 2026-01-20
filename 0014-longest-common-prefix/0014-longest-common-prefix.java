class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j);
            for (int k = 1; k < strs.length; k++) {
                if (j >= strs[k].length() || strs[k].charAt(j) != c) return strs[0].substring(0, i);
            }
            i++;
        }
        return strs[0].substring(0, i);
    }
}