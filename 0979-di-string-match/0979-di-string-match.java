class Solution {
    public int[] diStringMatch(String s) {
        int[] perm = new int[s.length() + 1];
        int i = 0;
        int d = s.length();
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'I') {
                perm[j] = i;
                i++;
            } else {
                perm[j] = d;
                d--;
            }
        }
        perm[s.length()] = i;
        return perm;
    }
}