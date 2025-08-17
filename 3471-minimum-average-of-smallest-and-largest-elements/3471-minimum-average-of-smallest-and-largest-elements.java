class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        List<Double> averages = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length / 2) {
                double avg = (double) (nums[i] + nums[nums.length - i - 1]) / 2;
                averages.add(avg);
            } else {
                break;
            }
        }

        Collections.sort(averages);

        return averages.getFirst();
    }
}