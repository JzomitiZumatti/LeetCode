class Solution {
    public int maxScore(String s) {
        int max = 0;
        int index = 0;
        while (index < s.length() - 1) {
            String left = s.substring(0, index + 1);
            String right = s.substring(index + 1);
            int sum = zeroOnesSum(left, right);
            max = Math.max(max, sum);
            index++;
        }
        return max;
    }

    private static int zeroOnesSum(String left, String right) {
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) == '0') zeros++;
        }
        for (int i = 0; i < right.length(); i++) {
            if (right.charAt(i) == '1') ones++;
        }
        return zeros + ones;
    }
}