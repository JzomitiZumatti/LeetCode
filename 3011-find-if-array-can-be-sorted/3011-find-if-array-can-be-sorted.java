class Solution {
    public boolean canSortArray(int[] nums) {
        if (isSorted(nums)) return true;
        List<List<Integer>> groups = new ArrayList<>();
        groups.add(new ArrayList<>());
        groups.getFirst().add(nums[0]);
        int cur = 0;
        for (int i = 1; i < nums.length; i++) {
            if (Integer.bitCount(nums[i - 1]) == Integer.bitCount(nums[i])) {
                groups.get(cur).add(nums[i]);
            } else {
                Collections.sort(groups.get(cur));
                groups.add(new ArrayList<>());
                cur++;
                groups.get(cur).add(nums[i]);
            }
        }
        Collections.sort(groups.get(cur));
        System.out.println(groups);
        for (int i = 1; i < groups.size(); i++) {
            int max = groups.get(i - 1).getLast();
            int min = groups.get(i).getFirst();
            if (max > min) return false;
        }
        return true;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}