class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                int counter = 0;
                int current = nums[i];
                while (current % 3 != 0) {
                    current--;
                    counter++;
                }
                int temp = 0;
                current = nums[i];
                while (current % 3 != 0) {
                    current++;
                    temp++;
                }

                counter = Math.min(counter, temp);
                res += counter;
            }
        }

        return res;
    }
}