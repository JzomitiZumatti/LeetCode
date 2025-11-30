class Solution {
    public int averageValue(int[] nums) {
        int avg = 0;
        int counter = 0;
        for (int num : nums) {
            if (num % 2 == 0 && num % 3 == 0) {
                avg += num;
                counter++;
            }
        }
        return counter == 0 ? 0 : avg / counter;
    }
}