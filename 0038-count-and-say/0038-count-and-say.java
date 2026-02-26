class Solution {
    public String countAndSay(int n) {
        String[] dp = new String[n];
        dp[0] = "1";
        int i = 1;
        while (i < n) {
            int counter = 1;
            StringBuilder stringBuilder = new StringBuilder();
            char prev = dp[i -1].charAt(0);
            for (int j = 1; j < dp[i - 1].length(); j++) {
                char current = dp[i -1].charAt(j);
                if (prev == current) counter++;
                else {
                    stringBuilder.append(counter).append(prev);
                    counter = 1;
                    prev = current;
                }
            }
            stringBuilder.append(counter).append(prev);
            dp[i] = stringBuilder.toString();
            System.out.println(dp[i]);
            i++;
        }
        return dp[n -1];
    }
}