class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, Integer> playerLoses = new HashMap<>();
        TreeSet<Integer> players = new TreeSet<>();
        for (int[] match : matches) {
            players.add(match[0]);
            players.add(match[1]);
            playerLoses.put(match[1], playerLoses.getOrDefault(match[1], 0) + 1);
        }
        List<Integer> zeroLoses = new ArrayList<>();
        List<Integer> oneLose = new ArrayList<>();
        for (Integer player : players) {
            if (playerLoses.containsKey(player)) {
                if (playerLoses.get(player) == 1) oneLose.add(player);
            } else zeroLoses.add(player);
        }
        ans.add(zeroLoses);
        ans.add(oneLose);
        return ans;
    }
}