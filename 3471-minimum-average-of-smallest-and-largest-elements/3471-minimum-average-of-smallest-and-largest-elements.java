class Solution {
    public double minimumAverage(int[] nums) {
        PriorityQueue<Double> averages = new PriorityQueue<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length / 2) {
                double avg = (double) (nums[i] + nums[nums.length - i - 1]) / 2;
                averages.add(avg);
            } else {
                break;
            }
        }

        return !averages.isEmpty() ? averages.poll() : 0;
    }
}