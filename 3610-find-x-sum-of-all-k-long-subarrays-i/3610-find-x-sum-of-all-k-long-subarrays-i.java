class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length - k + 1;
        int counter = 0;
        while (counter < n) {
            int c = 0;
            Map<Integer, Integer> numFreq = new HashMap<>();
            for (int i = counter; i < nums.length; i++) {
                if (c < k) numFreq.put(nums[i], numFreq.getOrDefault(nums[i], 0) + 1);
                c++;
            }
            list.add(sumOfSubArr(numFreq, x));
            counter++;
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static int sumOfSubArr(Map<Integer,Integer> map, int x) {
        Map<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
        int counter = 0;
        int sum = 0;
        List<Integer> keys = new ArrayList<>(sortedMap.keySet());
        Collections.reverse(keys);
        if (x < keys.size()) {
            while (counter < x) {
                sum += keys.get(counter) * sortedMap.get(keys.get(counter));
                counter++;
            }
        } else {
            for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
                sum += entry.getKey() * entry.getValue();
            }
        }
        return sum;
    }
}