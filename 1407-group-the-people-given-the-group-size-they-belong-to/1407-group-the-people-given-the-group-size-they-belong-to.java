class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            map.put(i, groupSizes[i]);
        }
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> groups = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int groupSize = entry.getValue();
            groups.computeIfAbsent(groupSize, k -> new ArrayList<>()).add(key);
        }

        for (Map.Entry<Integer, List<Integer>> entry : groups.entrySet()) {
            int groupSize = entry.getKey();
            List<Integer> keys = entry.getValue();
            List<Integer> currentGroup = new ArrayList<>();

            for (int key : keys) {
                if (currentGroup.size() == groupSize) {
                    res.add(new ArrayList<>(currentGroup));
                    currentGroup.clear();
                }
                currentGroup.add(key);
            }
            if (!currentGroup.isEmpty()) {
                res.add(new ArrayList<>(currentGroup));
            }
        }
        return res;
    }
}