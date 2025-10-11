class Solution {
    public long maximumTotalDamage(int[] power) {
        Arrays.sort(power);
        TreeMap<Integer, Integer> numberFreq = new TreeMap<>();
        for (int i : power) {
            numberFreq.put(i, numberFreq.getOrDefault(i, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(numberFreq.keySet());
        Map<Integer, Integer> keyToIndex = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            keyToIndex.put(keys.get(i), i);
        }
        long[] dp = new long[keys.size()];
        for (int i = keys.size() - 1; i >= 0; i--) {
            int p = keys.get(i);
            long include = (long)p * numberFreq.get(p);
            Integer nextKey = numberFreq.higherKey(p + 2);
            if (nextKey != null) {
                int nextIndex = keyToIndex.get(nextKey); // O(1)
                include += dp[nextIndex];
            }
            long exclude = (i + 1 < keys.size()) ? dp[i + 1] : 0;
            dp[i] = Math.max(include, exclude);
        }
        return dp[0];
    }
}