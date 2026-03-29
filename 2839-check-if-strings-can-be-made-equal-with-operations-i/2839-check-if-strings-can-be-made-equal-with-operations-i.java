class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if (i < 2 && c1[i] != c2[i] && c1[i] != c2[i + 2]) return false;
            else if (i < 2 && c1[i] != c2[i]) {
                char temp = c2[i + 2];
                c2[i + 2] = c2[i];
                c2[i] = temp;
            } else if (c1[i] != c2[i]) return false;
        }
        return true;
    }
}