class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder();
        while (ans.length() < num) {
            int n = Math.min(9, sum);
            sum -= n;
            ans.append(n);
        }
        return sum == 0 ? ans.toString() : "";
    }
}