class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        int[] dayInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int leaps = 0;
        int counter = 0;
        for (int i = 1971; i < year; i++) {
            counter += 365;
            if (isLeap(i)) leaps++;
        }
        counter += leaps;
        for (int i = 0; i < month - 1; i++) {
            if (i == 1 && isLeap(year)) counter += 29;
            else counter += dayInMonths[i];
        }
        counter += day;
        return days[(counter - 1) % 7];
    }

    private static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else return true;
        } else return false;
    }
}