class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int[] arr : pick) {
            int player = arr[0];
            int ball = arr[1];
            map.putIfAbsent(player, new HashMap<>());
            map.get(player).put(ball, map.get(player).getOrDefault(ball, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : map.entrySet()) {
            int playerN = entry.getKey();
            int max = 0;
            for (Integer val : entry.getValue().values()) {
                max = Math.max(max, val);
            }
            if (max > playerN) ans++;
        }
        return ans;
    }
}