class Solution {
    public boolean rotateString(String s, String goal) {
        int n = 0;
        while (n <= s.length() - 1) {
            int len = s.length();
            n = n % len;
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(len - n)).append(s, 0, len - n);
            if (sb.toString().equals(goal)) return true;
            n++;
        }
        return false;
    }
}