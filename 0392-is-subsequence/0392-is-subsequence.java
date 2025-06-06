class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;

        String[] sA = s.split("");
        String[] tA = t.split("");

        int lastMatchIndex = -1;

        for (int i = 0; i < sA.length; i++) {
            boolean found = false;
            for (int j = lastMatchIndex + 1; j < tA.length; j++) {
                if (sA[i].equals(tA[j])) {
                    lastMatchIndex = j;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }

        return true;
    }
}