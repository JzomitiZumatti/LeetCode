class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        for (int i = hours.length - 1; i >= 0; i--) {
            if (hours[i] < target) {
                return hours.length - (i + 1);
            }
        }
        return hours.length;
    }
}