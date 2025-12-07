class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        Map<Integer, Map<Character, Integer>> posTypeFreq = new HashMap<>();
        for (int i = 0; i < garbage.length; i++) {
            Map<Character, Integer> t = new HashMap<>();
            for (int j = 0; j < garbage[i].length(); j++) {
                t.put(garbage[i].charAt(j), t.getOrDefault(garbage[i].charAt(j), 0) + 1);
            }
            posTypeFreq.put(i, t);
        }
        int g = 0;
        int p = 0;
        int m = 0;

        int pMax = -1;
        int gMax = -1;
        int mMax = -1;
        int pos = 0;
        for (Map<Character, Integer> map : posTypeFreq.values()) {
            if (map.containsKey('G')) {
                gMax = Math.max(gMax, pos);
                g += map.get('G');
            }
            if (map.containsKey('P')) {
                pMax = Math.max(pMax, pos);
                p += map.get('P');
            }

            if (map.containsKey('M')) {
                mMax = Math.max(mMax, pos);
                m += map.get('M');
            }
            pos++;
        }

        if (pMax > 0) {
            for (int j = 0; j < pMax; j++) {
                p += travel[j];
            }
        }
        if (gMax > 0) {
            for (int j = 0; j < gMax; j++) {
                g += travel[j];
            }
        }
        if (mMax > 0) {
            for (int j = 0; j < mMax; j++) {
                m += travel[j];
            }
        }
        return p + m + g;
    }
}