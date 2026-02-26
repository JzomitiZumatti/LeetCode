class Solution {
    public String countAndSay(int n) {
        String[] dp = new String[n];
        dp[0] = "1";
        int i = 1;
        while (i < n) {
            int counter = 1;
            StringBuilder stringBuilder = new StringBuilder();
            int prev = dp[i -1].charAt(0) - '0';
            for (int j = 1; j < dp[i - 1].length(); j++) {
                int current = dp[i -1].charAt(j) - '0';
                if (prev == current) counter++;
                else {
                    stringBuilder.append(counter).append(prev);
                    counter = 1;
                    prev = current;
                }
            }
            stringBuilder.append(counter).append(prev);
            dp[i] = stringBuilder.toString();
            i++;
        }
        return dp[n -1];
    }
}