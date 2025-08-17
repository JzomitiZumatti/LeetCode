class Solution {
    public double minimumAverage(int[] nums) {
        PriorityQueue<Double> averages = new PriorityQueue<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            double avg = (double) (nums[left] + nums[right]) / 2;
            averages.add(avg);
            left++;
            right--;
        }

        return !averages.isEmpty() ? averages.poll() : 0;
    }
}