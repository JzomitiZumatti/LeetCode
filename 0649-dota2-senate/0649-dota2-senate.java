class Solution {
    public String predictPartyVictory(String senate) {
        LinkedList<Integer> r = new LinkedList<>();
        LinkedList<Integer> d = new LinkedList<>();
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'D') {
                d.add(i);
            } else {
                r.add(i);
            }
        }

        while (!d.isEmpty() && !r.isEmpty()) {
            int rS = r.poll();
            int dS = d.poll();
            if (rS < dS) {
                r.addLast(rS + senate.length());
            } else {
                d.addLast(dS + senate.length());
            }
        }

        return !r.isEmpty() ? "Radiant" : "Dire";
    }

    private static boolean isAvailable(Map<Integer, Integer> map, int i) {
        if (!map.isEmpty() && map.containsKey(i)) {
            return map.get(i) != 0;
        } else {
            return false;
        }
    }
}