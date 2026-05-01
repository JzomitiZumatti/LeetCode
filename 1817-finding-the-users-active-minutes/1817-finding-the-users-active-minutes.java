class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];
        Map<Integer, Set<Integer>> numMins = new HashMap<>();
        for (int[] log : logs) {
            numMins.putIfAbsent(log[0], new HashSet<>());
            numMins.get(log[0]).add(log[1]);
        }
        for (Map.Entry<Integer, Set<Integer>> entry : numMins.entrySet()) {
            ans[entry.getValue().size() - 1]++;
        }
        return ans;
    }
}