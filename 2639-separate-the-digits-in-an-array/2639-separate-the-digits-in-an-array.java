class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : nums) {
            stringBuilder.append(num);
        }
        int[] separateNums = new int[stringBuilder.length()];
        for (int i = 0; i < stringBuilder.length(); i++) {
            separateNums[i] = Integer.parseInt(String.valueOf(stringBuilder.toString().charAt(i)));
        }
        return separateNums;
    }
}