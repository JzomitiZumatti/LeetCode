class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res = new int[2];
        Map<Integer, Integer> numbFreq1 = new HashMap<>();
        Map<Integer, Integer> numbFreq2 = new HashMap<>();

        for (int n1 : nums1) {
            numbFreq1.put(n1, numbFreq1.getOrDefault(n1, 0) + 1);
        }

        for (int n2 : nums2) {
            numbFreq2.put(n2, numbFreq2.getOrDefault(n2, 0) + 1);
        }

        int counter = 0;
        for (int n1 : nums1) {
            if (numbFreq2.containsKey(n1)) {
                counter++;
            }
        }
        res[0] = counter;

        counter = 0;

        for (int n2 : nums2) {
            if (numbFreq1.containsKey(n2)) {
                counter++;
            }
        }
        res[1] = counter;

        return res;
    }
}