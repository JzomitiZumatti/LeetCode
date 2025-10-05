class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> goodTriplets = new HashSet<>();
        int i = 0;
        while (i < nums.length - 2) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (nums[i] + sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    goodTriplets.add(list);
                    right--; left++;
                } else if (nums[i] + sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
            i++;
        }
        return new ArrayList<>(goodTriplets);
    }
}