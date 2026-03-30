class Solution {
    public boolean checkStrings(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if (c1[i] != c2[i]) {
                boolean isPres = false;
                for (int j = i + 1; j < s2.length(); j++) {
                    if ((j - i) % 2 == 0 && c2[j] == c1[i]) {
                        isPres = true;
                        char temp = c2[j];
                        c2[j] = c2[i];
                        c2[i] = temp;
                    }
                }
                if (!isPres) return false;
            }
        }
        return true;
    }
}