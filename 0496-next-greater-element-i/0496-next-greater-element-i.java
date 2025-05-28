class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> next = new ArrayList<>();
        for (int i = 0; i < nums1.length; i ++) {
            boolean flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    flag = true;
                }
                if (nums2[j] > nums1[i] && flag) {
                    next.add(nums2[j]);
                    break;
                } else if (flag && j == nums2.length - 1) {
                    next.add(-1);
                    break;
                }
            }
        }
        return next.stream().mapToInt(i -> i).toArray();
    }
}