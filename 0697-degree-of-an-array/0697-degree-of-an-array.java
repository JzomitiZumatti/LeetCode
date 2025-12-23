class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        int maxFreq = -1;
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (entry.getValue() > maxFreq) maxFreq = entry.getValue();
        }
        Set<Integer> unique = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (entry.getValue() == maxFreq) unique.add(entry.getKey());
        }
        List<int[]> list = new ArrayList<>();
        for (Integer un : unique) {
            int[] res = new int[maxFreq];
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == un) {
                    res[j] = i;
                    j++;
                }
            }
            Arrays.sort(res);
            list.add(res);
        }
        int min = nums.length;
        for (int[] arrs : list) {
            System.out.println(Arrays.toString(arrs));
            min = Math.min(min, arrs.length > 1 ? arrs[arrs.length - 1] - arrs[0] + 1 : 1);
        }
        return min;
    }
}