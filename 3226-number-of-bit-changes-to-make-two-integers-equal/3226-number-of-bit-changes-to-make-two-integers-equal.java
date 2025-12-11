class Solution {
    public int minChanges(int n, int k) {
        if (n == k) return 0;
        String nBinary = Integer.toBinaryString(n);
        String kBinary = String.format("%" + nBinary.length() + "s", Integer.toBinaryString(k)).replaceAll(" ", "0");
        if (nBinary.length() < kBinary.length()) return -1;
        int counter = 0;
        for (int i = 0; i < nBinary.length(); i++) {
            boolean b = nBinary.charAt(i) != kBinary.charAt(i);
            if (b && nBinary.charAt(i) == '1') counter++;
            if (b && nBinary.charAt(i) == '0') return -1;
        }
        return counter;
    }
}