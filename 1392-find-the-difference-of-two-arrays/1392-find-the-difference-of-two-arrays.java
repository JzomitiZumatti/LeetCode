class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();
        for (int j : nums1) {
            n1.add(j);
        }
        for (int j : nums2) {
            n2.add(j);
        }

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for (Integer el : n1) {
            if (!n2.contains(el)) l1.add(el);
        }
        for (Integer el : n2) {
            if (!n1.contains(el)) l2.add(el);
        }
        res.add(l1);
        res.add(l2);
        return res;
    }
}