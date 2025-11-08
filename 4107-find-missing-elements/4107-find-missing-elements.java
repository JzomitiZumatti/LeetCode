class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> ns = new HashSet<>();
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            ns.add(num);
        }
        List<Integer> missing = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!ns.contains(i)) missing.add(i);
        }
        return missing;
    }
}