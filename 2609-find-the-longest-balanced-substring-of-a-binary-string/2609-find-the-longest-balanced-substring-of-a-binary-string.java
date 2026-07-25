class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            stack.add(c);
        }
        int zeroCounter = 0;
        int onesCounter = 0;
        int ans = 0;
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (c == '0' && onesCounter == 0) zeroCounter++;
            else if (c == '0') {
                ans = Math.max(ans, Math.min(zeroCounter, onesCounter));
                zeroCounter = 1;
                onesCounter = 0;
            }
            else if (c == '1' && zeroCounter != 0) onesCounter++;
        }

        return Math.max(ans, Math.min(zeroCounter, onesCounter)) * 2;
    }
}