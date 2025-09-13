class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int counter = 0;
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k <= i; k++) {
                    if (A[j] == B[k]) counter++;
                }
            }
            res[i] = counter;
        }
        return res;
    }
}