class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for (int h : hours) {
            if (h >= target) {
                counter++;
            }
        }
        return counter;
    }
}