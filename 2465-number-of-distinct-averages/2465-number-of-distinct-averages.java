class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> ans = new HashSet<>();
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start < nums.length / 2) {
            double avg = (double) (nums[start] + nums[end]) / 2;
            ans.add(avg);
            start++;
            end--;
        }
        return ans.size();
    }
}