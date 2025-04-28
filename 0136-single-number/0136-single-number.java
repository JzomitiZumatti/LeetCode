class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        int freq = 0;
        Arrays.sort(nums);
        List<Integer> unique = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && freq <= 1) {
                    freq++;
                }
            }

            if (freq == 1) {
                unique.add(nums[i]);
                result = nums[i];
            }
            freq = 0;
        }
        System.out.println(unique);
        return result;
    }
}