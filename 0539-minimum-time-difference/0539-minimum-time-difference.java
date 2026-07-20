class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();
        for (String timePoint : timePoints) {
            String[] arr = timePoint.split(":");
            minutes.add(Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]));
        }
        Collections.sort(minutes);
        int ans = Integer.MAX_VALUE;
        if (minutes.size() > 1) {
            for (int i = 1; i < minutes.size(); i++) {
                int a = minutes.get(i) == 0 ? 1440 : minutes.get(i);
                int b = minutes.get(i - 1) == 0 ? 1440 : minutes.get(i - 1);
                ans = Math.min(ans, Math.abs(a - b));
            }
            int a = minutes.getLast() == 0 ? 1440 : (1440 - minutes.getLast());
            int b = minutes.getFirst() == 0 ? 0 : minutes.getFirst();
            ans = Math.min(ans, Math.abs(a + b));
            return ans;
        } else return minutes.getFirst();
    }
}