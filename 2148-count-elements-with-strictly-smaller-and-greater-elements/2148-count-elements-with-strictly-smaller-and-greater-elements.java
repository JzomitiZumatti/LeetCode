class Solution {
    public int countElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int counter = 0;
        for (int num : nums) {
            if (num != max && num != min) counter++;
        }
        return counter;
    }
}