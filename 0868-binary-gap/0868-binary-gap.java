class Solution {
    public int binaryGap(int n) {
        int max = 0;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c == '1') {
                for (int j = i + 1; j < binary.length(); j++) {
                    char cc = binary.charAt(j);
                    if (cc == '1') {
                        max = Math.max(max, j - i);
                        break;
                    }
                }
            }
        }
        return max;
    }
}