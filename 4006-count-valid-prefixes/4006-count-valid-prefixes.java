class Solution {
    public int countValidPrefixes(String s) {
        int ans = 0;
        int zeroCounter = 0;
        int oneCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0') zeroCounter++;
            else oneCounter++;
            if (Math.abs(zeroCounter - oneCounter) <= 1) ans++;
        }
        return ans;
    }
}