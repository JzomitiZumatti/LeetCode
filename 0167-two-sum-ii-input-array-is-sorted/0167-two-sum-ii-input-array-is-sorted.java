class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] indexes = new int[2];
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                indexes[0] = left + 1;
                indexes[1] = right + 1;
                break;
            }
            if (numbers[left] + numbers[right] > target) {
                right--;
            }
            if (numbers[left] + numbers[right] < target) {
                left++;
            }
        }
        return indexes;
    }
}