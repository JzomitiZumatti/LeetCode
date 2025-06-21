class Solution {
    public String predictPartyVictory(String senate) {
        String[] senateArr = senate.split("");
        LinkedList<Integer> r = new LinkedList<>();
        LinkedList<Integer> d = new LinkedList<>();
        for (int i = 0; i < senateArr.length; i++) {
            if (senateArr[i].equals("D")) {
                d.add(i);
            } else {
                r.add(i);
            }
        }

        while (!d.isEmpty() && !r.isEmpty()) {
            int rS = r.poll();
            int dS = d.poll();
            if (rS < dS) {
                r.addLast(rS + senateArr.length);
            } else {
                d.addLast(dS + senateArr.length);
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