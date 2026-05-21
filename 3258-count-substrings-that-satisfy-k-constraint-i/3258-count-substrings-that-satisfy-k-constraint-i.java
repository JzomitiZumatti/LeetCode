class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int ans = 1;
        int oneCounter = 0;
        int zeroCounter = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c == '1') oneCounter++;
            else zeroCounter++;
            ans++;
            for (int j = i + 1; j < s.length(); j++) {
                char cc = s.charAt(j);
                if (cc == '1') oneCounter++;
                else zeroCounter++;
                if (oneCounter > k && zeroCounter > k) break;
                else ans++;
            }
            oneCounter = 0;
            zeroCounter = 0;
        }
        return ans;
    }
}