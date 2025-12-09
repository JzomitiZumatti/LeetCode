class Solution {
    public long minimumSteps(String s) {
        long w = 0;
        long steps = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                steps += i - w;
                w++;
            }
        }
        return steps;
    }
}