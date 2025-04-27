class Solution {
    public int removeElement(int[] nums, int val) {
        int[] newArr = new int[nums.length];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 0;
            } else {
                a++;
            }
        }
        int i = 0;
        for (int aas : nums) {
            if (aas != 0 && i < a) {
                newArr[i] = aas;
                i++;
            }
        }
        Arrays.fill(nums, 0);
        int j = 0;
        for (int aas : newArr) {
            if (j < a) {
                nums[j] = aas;
                j++;
            }
        }
        return a;
    }
}