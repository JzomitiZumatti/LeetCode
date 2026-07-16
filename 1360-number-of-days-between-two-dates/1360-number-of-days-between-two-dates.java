class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int[] dayInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Set<Integer> leapYears = new HashSet<>();
        for (int i = 1972; i <= 2096; i = i + 4) {
            leapYears.add(i);
        }
        String[] d1 = date1.split("-");
        String[] d2 = date2.split("-");
        int dd1 = 0;
        int dd2 = 0;
        for (int i = 1971; i < Integer.parseInt(d1[0]); i++) {
            if (leapYears.contains(i)) dd1 += 366;
            else dd1 += 365;
        }

        for (int i = 0; i < Integer.parseInt(d1[1]) - 1; i++) {
            if (i == 1 && leapYears.contains(Integer.parseInt(d1[0]))) dd1 += 29;
            else dd1 += dayInMonths[i];
        }
        dd1 += Integer.parseInt(d1[2]);
        for (int i = 1971; i < Integer.parseInt(d2[0]); i++) {
            if (leapYears.contains(i)) dd2 += 366;
            else dd2 += 365;
        }

        for (int i = 0; i < Integer.parseInt(d2[1]) - 1; i++) {
            if (i == 1 && leapYears.contains(Integer.parseInt(d2[0]))) dd2 += 29;
            else dd2 += dayInMonths[i];
        }
        dd2 += Integer.parseInt(d2[2]);
        return Math.abs(dd1 - dd2);
    }
}