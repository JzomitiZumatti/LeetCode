class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 1;
        char prev = s.charAt(0);
        if (prev == 'A') absent++;
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == 'A') {
                absent++;
                if (absent == 2) return false;
            }
            if (prev == 'L' && curr == prev) late++;
            else if (prev == 'L' && curr != prev) late = 1;
            if (late >= 3) return false;
            prev = curr;
        }
        return true;
    }
}