class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        Map<Integer, Stack<Integer>> numNums = new HashMap<>();
        for (int n : nums) {
            numNums.putIfAbsent(n, new Stack<>());
            numNums.get(n).add(n);
        }
        Map<Integer, Stack<Integer>> sortedMap = numNums.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        System.out.println(sortedMap);
        int i = 0;
        while (i < nums.length) {
            for (Map.Entry<Integer, Stack<Integer>> entry : sortedMap.entrySet()) {
                if (!entry.getValue().isEmpty()) {
                    ans[i] = entry.getValue().pop();
                    i++;
                }
            }
        }
        return ans;
    }
}