class Solution {
    public int minimumFlips(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bin).reverse();
        int counter = 0;
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) != stringBuilder.charAt(i)) counter++;
        }
        return counter;
    }
}