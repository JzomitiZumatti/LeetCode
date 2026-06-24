class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysSum = new int[daysPerMonth.length + 1];
        daysSum[0] = 0;
        for (int i = 1; i < daysSum.length; i++) {
            daysSum[i] = daysSum[i - 1] + daysPerMonth[i - 1];
        }
        Set<Integer> aliceDays = new HashSet<>();
        Set<Integer> bobDays = new HashSet<>();
        int aStart = daysSum[Integer.parseInt(arriveAlice.substring(0, 2)) - 1] + Integer.parseInt(arriveAlice.substring(3));
        int aEnd = daysSum[Integer.parseInt(leaveAlice.substring(0, 2)) - 1] + Integer.parseInt(leaveAlice.substring(3));
        int bStart = daysSum[Integer.parseInt(arriveBob.substring(0, 2)) - 1] + Integer.parseInt(arriveBob.substring(3));
        int bEnd = daysSum[Integer.parseInt(leaveBob.substring(0, 2)) - 1] + Integer.parseInt(leaveBob.substring(3));
        for (int i = aStart; i <= aEnd; i++) {
            aliceDays.add(i);
        }
        for (int i = bStart; i <= bEnd; i++) {
            bobDays.add(i);
        }
        int ans = 0;
        for (int i = 1; i <= 365; i++) {
            if (aliceDays.contains(i) && bobDays.contains(i)) ans++;
        }
        return ans;
    }
}