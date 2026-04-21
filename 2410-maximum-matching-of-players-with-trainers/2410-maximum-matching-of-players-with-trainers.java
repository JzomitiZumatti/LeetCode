class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int ans = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int p = 0;
        int t = 0;
        while (t < trainers.length && p < players.length) {
            if (players[p] <= trainers[t]) {
                ans++;
                p++;
            }
            t++;
        }
        return ans;
    }
}