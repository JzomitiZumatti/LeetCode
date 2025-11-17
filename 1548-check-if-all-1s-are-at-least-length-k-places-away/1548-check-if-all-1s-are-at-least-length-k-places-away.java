class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int first = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                first = i;
                break;
            }
        }

        int last = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 1) {
                last = i;
                break;
            }
        }

        for (int i = first; i <= last; i++) {
            stringBuilder.append(nums[i]);
        }
        String[] arrZeros = stringBuilder.toString().split("1");

        if (arrZeros.length == 0 && k > 0) return false;
        for (String zeros : arrZeros) {
            if (!zeros.isEmpty() && zeros.length() < k) return false;
        }
        return true;
    }
}