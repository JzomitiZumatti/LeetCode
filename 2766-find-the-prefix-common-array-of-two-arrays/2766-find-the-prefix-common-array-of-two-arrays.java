class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] prefixCommon = new int[A.length];
        int i = 0;
        while (i < A.length) {
            int counter = 0;
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k <= i; k++) {
                    if (A[j] == B[k]) counter++;
                }
            }
            prefixCommon[i] = counter;
            i++;
        }
        return prefixCommon;
    }
}