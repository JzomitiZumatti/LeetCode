class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        int hours;
        int minutes;
        for (int i = 0; i < 12; i++) {
            hours = i;
            for (int j = 0; j <= 59; j++) {
                minutes = j;
                if (bitSets(hours, minutes) == turnedOn) {
                    if (minutes <= 9) res.add(hours + ":0" + minutes);
                    else res.add(hours + ":" + minutes);
                }
            }
        }
        return res;
    }

    private static int bitSets(int a, int b) {
        int sum = 0;
        int[] hours = {1, 2, 4, 8};
        int[] minutes = {1, 2, 4, 8, 16, 32};
        int i = hours.length - 1;
        while (a > 0) {
            if (a < hours[i]) i--;
            else {
                a -= hours[i];
                sum++;
            }
        }
        i = minutes.length - 1;
        while (b > 0) {
            if (b < minutes[i]) i--;
            else {
                b -= minutes[i];
                sum++;
            }
        }
        return sum;
    }
}