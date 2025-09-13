class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        Map<Integer, Integer> numbFreq = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            numbFreq.put(A[i], numbFreq.getOrDefault(A[i], 0) + 1);
            numbFreq.put(B[i], numbFreq.getOrDefault(B[i], 0) + 1);
            res[i] = getFreq(numbFreq);

        }
        return res;
    }

    private static int getFreq(Map<Integer, Integer> map) {
        int counter = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            counter += entry.getValue() == 2 ? 1 : 0;
        }
        return counter;
    }
}