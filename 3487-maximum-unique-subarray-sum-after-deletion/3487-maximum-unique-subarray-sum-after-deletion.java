class Solution {
    public int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        Set<Integer> un = new HashSet<>();
        for (int num : nums) {
            max = Math.max(max, num);
            un.add(num);
        }
        if (max < 0) return max;
        int sum = 0;
        for (Integer u : un) {
            if (u > 0) sum += u;
        }
        return sum;
    }
}