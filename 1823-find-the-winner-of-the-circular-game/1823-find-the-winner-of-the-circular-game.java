class Solution {
    public int findTheWinner(int n, int k) {
        boolean[] players = new boolean[n];
        Arrays.fill(players, true);
        int i = n;
        int l = 0;
        while (i > 1) {
            int counter = 0;
            if (players[l]) counter++;
            while (counter < k) {
                l = (l + 1) % players.length;
                if (players[l]) counter++;
            }
            if (counter == k) {
                players[l] = false;
                i--;
            }
        }
        for (int j = 0; j < players.length; j++) {
            if (players[j]) return j + 1;
        }
        return -1;
    }
}