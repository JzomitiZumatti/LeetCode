class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        int counter = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
                j++;
                counter++;
            } else {
                j++;
            }
        }
        return counter;
    }
}