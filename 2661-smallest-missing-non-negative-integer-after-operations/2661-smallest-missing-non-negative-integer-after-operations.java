class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> reminderFreq = new HashMap<>();
        for (int num : nums) {
            int r = ((num % value) + value) % value;
            reminderFreq.put(r, reminderFreq.getOrDefault(r, 0) + 1);
        }

        int[] minReminderFreq = new int[]{0, Integer.MAX_VALUE};
        for (int r = 0; r < value; r++) {
            int f = reminderFreq.getOrDefault(r, 0);
            if (f < minReminderFreq[1]) {
                minReminderFreq[1] = f;
                minReminderFreq[0] = r;
            }
        }

        return minReminderFreq[1] * value + minReminderFreq[0];
    }
}