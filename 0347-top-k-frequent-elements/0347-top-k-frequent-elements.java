class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[] searchQuantity = new int[k];
        Map<Integer, Integer> numsAnsQuantity = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }
            numsAnsQuantity.put(nums[i], counter);
            counter = 0;
        }

        List<Integer> sortedKeys = new ArrayList<>(numsAnsQuantity.keySet());
        sortedKeys.sort((a, b) -> numsAnsQuantity.get(b) - numsAnsQuantity.get(a));

        for (int i = 0; i < k; i++) {
            searchQuantity[i] = sortedKeys.get(i);
        }
        return searchQuantity;
    }
}