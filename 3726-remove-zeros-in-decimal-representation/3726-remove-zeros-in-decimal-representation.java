class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);
        return Long.parseLong(s.replaceAll("0", ""));
    }
}