class Solution {
    public int dayOfYear(String date) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        boolean isLeap = year % 4 == 0 && year != 1900;
        int ans = 0;
        for (int i = 0; i < month - 1; i++) {
            if (i == 1 && isLeap) ans += 29;
            else ans += months[i];
        }
        ans += day;
        return ans;
    }
}