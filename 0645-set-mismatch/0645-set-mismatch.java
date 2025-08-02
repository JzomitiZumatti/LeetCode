class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        List<Integer> pairs = new ArrayList<>();
        boolean[] ns = new boolean[nums.length + 1];
        Arrays.fill(ns, false);
        for (int i = 0; i < ns.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i + 1 == nums[j]) {
                    ns[i] = true;
                    break;
                }
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                int missing = returnMissingNumber(ns);
                if (missing == -1) {
                    pairs.add(nums[i - 1]);
                    pairs.add(nums[i] + 1);
                    break;
                } else {
                    pairs.add(nums[i - 1]);
                    pairs.add(missing + 1);
                }
            }
        }
        return pairs.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static int returnMissingNumber(boolean[] numbs) {
        for (int i = 0; i < numbs.length; i++) {
            if (!numbs[i]) {
                return i;
            }
        }
        return -1;
    }
}