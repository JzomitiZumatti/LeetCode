class Solution {
    public int[] scoreValidator(String[] events) {
        int[] ans = {0, 0};
        for (String event : events) {
            switch (event) {
                case "W" -> ans[1]++;
                case "WD", "NB" -> ans[0]++;
                default -> {
                    int n = Integer.parseInt(event);
                    ans[0] += n;
                }
            }
            if (ans[1] == 10) break;
        }
        return ans;
    }
}