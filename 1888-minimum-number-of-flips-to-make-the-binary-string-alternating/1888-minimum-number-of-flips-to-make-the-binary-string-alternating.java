class Solution {
    public int minFlips(String s) {
        int min = s.length();
        StringBuilder alt1 = new StringBuilder();
        StringBuilder alt2 = new StringBuilder();
        StringBuilder origin = new StringBuilder();
        for (int i = 0; i < s.length() * 2; i++) {
            if (i % 2 == 0) {
                alt1.append(1);
                alt2.append(0);
            } else {
                alt1.append(0);
                alt2.append(1);
            }
        }
        origin.append(s).append(s);
        int left = 0;
        int right = 0;
        int missMatch1 = 0;
        int missMatch2 = 0;
        while (right < origin.length()) {
            char c = origin.charAt(right);
            if (c != alt1.charAt(right)) missMatch1++;
            if (c != alt2.charAt(right)) missMatch2++;
            if (right - left + 1 == s.length()) {
                min = Math.min(min, Math.min(missMatch1, missMatch2));
                if (origin.charAt(left) != alt1.charAt(left)) missMatch1--;
                if (origin.charAt(left) != alt2.charAt(left)) missMatch2--;
                left++;
            }
            right++;
        }
        return min;
    }
}