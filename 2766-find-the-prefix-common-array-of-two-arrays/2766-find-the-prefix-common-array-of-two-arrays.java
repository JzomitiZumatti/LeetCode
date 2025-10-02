class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] prefixCommon = new int[A.length];
        int i = 0;
        while (i < A.length) {
            int counter = 0;
            Map<Integer, Integer> numFreq = new HashMap<>();
            for (int j = 0; j <= i; j++) {
                numFreq.put(A[j], numFreq.getOrDefault(A[j], 0) + 1);
                numFreq.put(B[j], numFreq.getOrDefault(B[j], 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
                if (entry.getValue() == 2) {
                    counter++;
                }
            }
            prefixCommon[i] = counter;
            i++;
        }
        return prefixCommon;
    }
}