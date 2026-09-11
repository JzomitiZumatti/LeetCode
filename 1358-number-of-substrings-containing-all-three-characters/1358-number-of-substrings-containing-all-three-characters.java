class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int[] aSum = new int[s.length() + 1];
        int[] bSum = new int[s.length() + 1];
        int[] cSum = new int[s.length() + 1];
        aSum[0] = 0;
        bSum[0] = 0;
        cSum[0] = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            aSum[i + 1] = c == 'a' ? aSum[i] + 1 : aSum[i];
            bSum[i + 1] = c == 'b' ? bSum[i] + 1 : bSum[i];
            cSum[i + 1] = c == 'c' ? cSum[i] + 1 : cSum[i];
        }
        int i = 0;
        while (i < s.length() - 1) {
            int j = i + 2;
            while (j <= s.length()) {
                if (aSum[j] - aSum[i] >= 1 && bSum[j] - bSum[i] >= 1 && cSum[j] - cSum[i] >= 1) {
                    ans += s.length() - j + 1;
                    break;
                }
                j++;
            }
            i++;
        }
        return ans;
    }
}