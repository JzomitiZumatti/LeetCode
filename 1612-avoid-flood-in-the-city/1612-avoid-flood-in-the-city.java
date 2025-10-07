class Solution {
    public int[] avoidFlood(int[] rains) {
        int[] res = new int[rains.length];
        Set<Integer> dryDays = new HashSet<>();
        Map<Integer, Integer> lakeDay = new HashMap<>();
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
            } else if (rains[i] > 0) {
                if (!lakeDay.containsKey(rains[i])) {
                    res[i] = -1;
                    lakeDay.put(rains[i], i);
                } else {
                    int min = Integer.MAX_VALUE;
                    for (Integer day : dryDays) {
                        if (day > lakeDay.get(rains[i])) min = Math.min(min, day);
                    }
                    if (min != Integer.MAX_VALUE) {
                        res[min] = rains[i];
                        res[i] = -1;
                        dryDays.remove(min);
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