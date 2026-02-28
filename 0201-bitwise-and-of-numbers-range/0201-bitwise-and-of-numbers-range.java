class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        StringBuilder stringBuilder = new StringBuilder();
        String l = String.format("%32s", Integer.toBinaryString(left)).replaceAll(" ", "0");
        String r = String.format("%32s", Integer.toBinaryString(right)).replaceAll(" ", "0");
        for (int i = 0; i < 32; i++) {
            if (l.charAt(i) == r.charAt(i)) stringBuilder.append(l.charAt(i));
            else break;
        }
        stringBuilder.append("0".repeat(Math.max(0, 32 - stringBuilder.length())));
        return Integer.parseInt(stringBuilder.toString(), 2);
    }
}