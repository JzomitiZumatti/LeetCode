class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character> unique = new HashSet<>();
        for (char suit : suits) {
            unique.add(suit);
        }
        if (unique.size() == 1) return "Flush";
        Map<Integer, Integer> rankFreq = new HashMap<>();
        for (int rank : ranks) {
            rankFreq.put(rank, rankFreq.getOrDefault(rank, 0) + 1);
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> entry : rankFreq.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        if (max >= 3) return "Three of a Kind";
        else if (max == 2) return "Pair";
        else return "High Card";
    }
}