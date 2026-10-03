class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> friends = new HashSet<>();
        for (int[] friendship : friendships) {
            int a = friendship[0];
            int b = friendship[1];
            friends.add(a);
            friends.add(b);
        }
        Map<Integer, Set<Integer>> friendLangs = new HashMap<>();
        for (Integer friend : friends) {
            friendLangs.putIfAbsent(friend, new HashSet<>());
            for (int i = 0; i < languages[friend - 1].length; i++) {
                int lang = languages[friend - 1][i];
                friendLangs.get(friend).add(lang);
            }
        }
        Set<Integer> goodPairs = new HashSet<>();
        for (int i = 0; i < friendships.length; i++) {
            int a = friendships[i][0];
            int b = friendships[i][1];
            for (int j = 0; j < languages[a - 1].length; j++) {
                int lang = languages[a - 1][j];
                if (friendLangs.get(b).contains(lang)) {
                    goodPairs.add(i);
                    break;
                }
            }
        }
        Set<Integer> badPairs = new HashSet<>();

        Map<Integer, Integer> langFreq = new HashMap<>();
        for (int i = 0; i < friendships.length; i++) {
            if (!goodPairs.contains(i)) {
                int a = friendships[i][0];
                int b = friendships[i][1];
                badPairs.add(a);
                badPairs.add(b);
            }
        }
        for (Integer badPair : badPairs) {
            for (int i = 0; i < languages[badPair - 1].length; i++) {
                int lang = languages[badPair - 1][i];
                langFreq.put(lang, langFreq.getOrDefault(lang, 0) + 1);
            }
        }

        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : langFreq.entrySet()) {
            min = Math.min(min, badPairs.size() - entry.getValue());
        }
        return min != Integer.MAX_VALUE ? min : 0;
    }
}