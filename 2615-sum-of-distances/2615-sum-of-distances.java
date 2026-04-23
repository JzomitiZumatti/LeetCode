class Solution {
    public long[] distance(int[] nums) {
        long[] ans = new long[nums.length];
        Map<Integer, List<Integer>> numberIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            numberIndices.putIfAbsent(n, new ArrayList<>());
            numberIndices.get(n).add(i);
        }

        Map<Integer, List<Long>> numberSum = new HashMap<>();
        for (Map.Entry<Integer, List<Integer>> entry : numberIndices.entrySet()) {
            List<Long> sums = new ArrayList<>();
            long prev = 0L;
            for (int i = 0; i < entry.getValue().size(); i++) {
                long cur = entry.getValue().get(i);
                sums.add(prev + cur);
                prev = sums.getLast();
            }
            numberSum.put(entry.getKey(), sums);
        }
        for (Map.Entry<Integer, List<Integer>> entry : numberIndices.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                long leftSum = i == 0 ? 0 : numberSum.get(entry.getKey()).get(i - 1);
                long left = (long) entry.getValue().get(i) * i - leftSum;
                long rightSum = numberSum.get(entry.getKey()).getLast() - numberSum.get(entry.getKey()).get(i);
                long right = rightSum - (long) entry.getValue().get(i) * (entry.getValue().size() - i - 1);
                long sum = left + right;
                ans[entry.getValue().get(i)] = Math.abs(sum);
            }
        }
        return ans;
    }
}