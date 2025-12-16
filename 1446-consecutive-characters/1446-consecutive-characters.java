class Solution {
    public int maxPower(String s) {
        int max = -1;
        int counter = 1;
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) counter++;
            else {
                prev = s.charAt(i);
                max = Math.max(max, counter);
                counter = 1;
            }
        }
        return Math.max(max, counter);
    }
}