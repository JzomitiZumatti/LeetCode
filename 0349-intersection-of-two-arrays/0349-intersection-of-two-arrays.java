class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> firstArr = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> secondArr = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        firstArr.retainAll(secondArr);
        return firstArr.stream().mapToInt(Number::intValue).toArray();
    }
}