class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] poses = new int[deck.length];
        Queue<Integer> p = new ArrayDeque<>();
        for (int i = 0; i < deck.length; i++) {
            p.add(i);
        }

        int i = 0;
        while (!p.isEmpty()) {
            poses[i] = p.poll();
            if (!p.isEmpty()) {
                int temp = p.poll();
                p.add(temp);
            }
            i++;
        }
        int[] ans = new int[deck.length];
        Arrays.sort(deck);
        for (int j = 0; j < poses.length; j++) {
            ans[poses[j]] = deck[j];
        }
        return ans;
    }
}