class Solution {
    public int[] avoidFlood(int[] rains) {
        int[] res = new int[rains.length];
        TreeSet<Integer> dryDays = new TreeSet<>();
        Map<Integer, Integer> lakeDay = new HashMap<>();
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
            } else if (rains[i] > 0) {
                if (!lakeDay.containsKey(rains[i])) {
                    res[i] = -1;
                    lakeDay.put(rains[i], i);
                } else {
                    Integer dryDay = dryDays.higher(lakeDay.get(rains[i]));
                    if (dryDay != null) {
                        res[dryDay] = rains[i];
                        res[i] = -1;
                        dryDays.remove(dryDay);
                        lakeDay.put(rains[i], i);
                    } else {
                        return new int[]{};
                    }
                }
            }
        }
        if (!dryDays.isEmpty()) {
            for (Integer dryDay : dryDays) {
                res[dryDay] = 1;
            }
        }
        return res;
    }
}