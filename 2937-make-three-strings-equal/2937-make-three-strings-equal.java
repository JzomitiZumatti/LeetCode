class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while (i < s1.length() && j < s2.length() && k < s3.length()) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);
            char c3 = s3.charAt(k);
            if (c1 != c2 || c2 != c3) break;
            else {
                i++;
                j++;
                k++;
                l++;
            }
        }
        return l == 0 ? -1 : (s1.length() - l) + (s2.length() - l) + (s3.length() - l);
    }
}