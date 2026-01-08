class Solution {
    public int minBitFlips(int start, int goal) {
        int counter = 0;
        int length = Math.max(Integer.toBinaryString(start).length(), Integer.toBinaryString(goal).length());
        String startBinary = padBinaryBitwise(start, length);
        String goalBinary = padBinaryBitwise(goal, length);
        for (int i = 0; i < startBinary.length(); i++) {
            if (startBinary.charAt(i) != goalBinary.charAt(i)) counter++;
        }
        return counter;
    }
    private static String padBinaryBitwise(int value, int length) {
        return Integer.toBinaryString((1 << length) | value).substring(1);
    }
}