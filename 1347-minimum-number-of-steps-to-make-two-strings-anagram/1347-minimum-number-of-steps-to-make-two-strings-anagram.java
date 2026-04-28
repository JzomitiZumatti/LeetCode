class Solution {
    public int minSteps(String s, String t) {
        int ans = 0;
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char sC = s.charAt(i);
            char tC = t.charAt(i);
            sFreq[sC - 'a']++;
            tFreq[tC - 'a']++;
        }

        for (int i = 0; i < tFreq.length; i++) {
            if (tFreq[i] > sFreq[i]) ans += tFreq[i] - sFreq[i];
        }

        return ans;
    }
}