class Solution {
    public static int findComplement(int num) {
        int mask = (1 << Integer.toBinaryString(num).length()) - 1;
        return num ^ mask;
    }
}