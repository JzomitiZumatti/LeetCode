class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] first = startTime.split(":");
        String[] sec = endTime.split(":");
        int ans = 0;
        ans = (Integer.parseInt(sec[0]) * 60 * 60) + (Integer.parseInt(sec[1]) * 60) + Integer.parseInt(sec[2]);
        ans -= (Integer.parseInt(first[0]) * 60 * 60) + (Integer.parseInt(first[1]) * 60) + Integer.parseInt(first[2]);
        return ans;
    }
}