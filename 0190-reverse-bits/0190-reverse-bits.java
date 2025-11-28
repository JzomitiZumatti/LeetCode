class Solution {
    public int reverseBits(int n) {
        return Integer.parseInt(to32Binary(n).reverse().toString(), 2);
    }

    private static StringBuilder to32Binary(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toBinaryString(n));
        if (stringBuilder.length() < 32) {
            return new StringBuilder(String.format("%32s", stringBuilder).replace(' ', '0'));
        } else {
            return stringBuilder;
        }
    }
}