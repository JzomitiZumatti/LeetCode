class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') stringBuilder.append(1);
            else stringBuilder.append(0);
        }
        return Integer.parseInt(stringBuilder.toString(), 2);
    }
}