class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);
                if (isPalinrom(str)) ans++;
            }
        }
        return ans;
    }

    private static boolean isPalinrom(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            if (l != r) return false;
            left++;
            right--;
        }
        return true;
    }
}