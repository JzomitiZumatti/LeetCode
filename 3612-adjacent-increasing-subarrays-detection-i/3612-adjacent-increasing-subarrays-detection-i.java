class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1 && nums.size() >= 2) return true;

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int start = 0; start <= nums.size() - k; start++) {
            boolean isValid = true;
            List<Integer> l = new ArrayList<>();

            for (int i = start; i < start + k - 1; i++) {
                if (nums.get(i) >= nums.get(i + 1)) {
                    isValid = false;
                    break;
                }
                l.add(nums.get(i));
            }

            if (isValid) {
                l.add(nums.get(start + k - 1));
                map.put(start, new ArrayList<>(l));
            }
        }

        if (map.isEmpty()) return false;

        Integer[] starts = map.keySet().toArray(new Integer[0]);
        Arrays.sort(starts);

        int i = 0;
        while (i < starts.length) {
            if (map.containsKey(starts[i] + k)) return true;
            i++;
        }
        return false;
    }
}