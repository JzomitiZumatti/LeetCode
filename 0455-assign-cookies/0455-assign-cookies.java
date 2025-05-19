class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0) {
            return 0;
        }
        int counter = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        do {
            if (s[j] >= g[i]) {
                i++;
                j++;
                counter++;
            } else {
                j++;
            }
        } while (i < g.length && j < s.length);
        return counter;
    }
}