class Solution {
    public int minOperations(String s) {
        StringBuilder zeroLeading = new StringBuilder();
        StringBuilder oneLeading = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                zeroLeading.append(0);
                oneLeading.append(1);
            } else {
                zeroLeading.append(1);
                oneLeading.append(0);
            }
        }
        int zeroLCounter = 0;
        int oneLCounter = 0;
        for (int i = 0; i < zeroLeading.length(); i++) {
            if (zeroLeading.charAt(i) != s.charAt(i)) zeroLCounter++;
            if (oneLeading.charAt(i) != s.charAt(i)) oneLCounter++;
        }
        return Math.min(zeroLCounter, oneLCounter);
    }
}