class Solution {
    public int hammingDistance(int x, int y) {
        int counter = 0;
        int diff = x ^ y;
        String bit = Integer.toBinaryString(diff);
        for (int i = 0; i < bit.length(); i++) {
            if (bit.charAt(i) == '1') counter++;
        }
        return counter;
    }
}