class Solution {
    public int bestClosingTime(String customers) {
        int[] pref = new int[customers.length() + 1];
        int[] suf = new int[customers.length() + 1];
        pref[0] = 0;
        suf[customers.length()] = 0;
        int k = 1;
        int l = customers.length() - 1;
        for (int i = 0, j = customers.length() - 1; i < customers.length() && j >= 0; i++, j--) {
            char cL = customers.charAt(i);
            char cR = customers.charAt(j);
            if (cL == 'N') pref[k] = pref[k - 1] + 1;
            else pref[k] = pref[k - 1];
            if (cR == 'Y') suf[l] = suf[l + 1] + 1;
            else suf[l] = suf[l + 1];
            k++;
            l--;
        }
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i <= customers.length(); i++) {
            int sum = pref[i] + suf[i];
            if (sum < min) {
                min = sum;
                ans = i;
            }
        }
        return ans;
    }
}