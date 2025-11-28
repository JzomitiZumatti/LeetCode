class Solution {
    public int reverseBits(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(to32Binary(n));
        return Integer.parseInt(stringBuilder.reverse().toString(), 2);
    }

    private static String to32Binary(int n) {
        String binaryString = Integer.toBinaryString(n);
        if (binaryString.length() < 32) {
            return String.format("%32s", binaryString).replace(' ', '0');
        } else {
            return binaryString;
        }
    }
}