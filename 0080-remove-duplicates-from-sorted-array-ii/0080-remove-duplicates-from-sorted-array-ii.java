class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int max = nums[nums.length - 1];
        int i = 0;
        int j = 1;
        int counter = 1;
        int c = 0;
        while (j < nums.length) {
            int curr = nums[i];
            int next = nums[j];
            if (curr == next) counter++;
            if (curr == next && counter > 2) {
                nums[j] = max;
                c++;
            }
            if (next > curr) {
                i = j;
                counter = 1;
            }
            j++;
        }
        Arrays.sort(nums);
        return nums.length - c;
    }
}