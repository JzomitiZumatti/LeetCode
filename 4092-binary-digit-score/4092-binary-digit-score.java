class Solution {
    public int calculateScore(int a, int b) {
        int a1 = Integer.bitCount(a);
        int b1 = Integer.bitCount(b);
        return a1 >= b1 ? a1 * b1 : b1 / a1;
    }
}