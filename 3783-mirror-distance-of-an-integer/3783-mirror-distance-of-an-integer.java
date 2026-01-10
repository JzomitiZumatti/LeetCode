class Solution {
    public int mirrorDistance(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n).reverse();
        int reverse = Integer.parseInt(stringBuilder.toString());
        return Math.abs(n - reverse);
    }
}