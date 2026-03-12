class Solution {
    public String customSortString(String order, String s) {
        int[] letterFreq = new int[26];
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i) - 'a';
            letterFreq[ascii]++;
        }
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            int ascii = c - 'a';
            res.repeat(c, letterFreq[ascii]);
            letterFreq[ascii] = 0;
        }
        for (int i = 0; i < letterFreq.length; i++) {
            if (letterFreq[i] > 0) {
                res.repeat((char)(i + 97), letterFreq[i]);
            }
        }
        return res.toString();
    }
}