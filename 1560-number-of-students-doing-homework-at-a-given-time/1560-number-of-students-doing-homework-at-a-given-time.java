class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int counter = 0;
        for (int i = 0; i < startTime.length; i++) {
            for (int j = startTime[i]; j <= endTime[i]; j++) {
                if (j == queryTime) counter++;
            }
        }
        return counter;
    }
}