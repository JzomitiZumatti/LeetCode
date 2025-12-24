class Solution {
    public int minimumMoves(String s) {
        int res = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                res++;
                i += 3;
            } else i++;
        }
        return res;
    }
}