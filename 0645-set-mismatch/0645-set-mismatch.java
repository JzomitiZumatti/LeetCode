class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        List<Integer> intList = new ArrayList<Integer>(nums.length);
        for (int i : nums)
        {
            intList.add(i);
        }
        TreeSet<Integer> nes = new TreeSet<>(intList);

        System.out.println(nes.size());
        int dublicate = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dublicate = i;
            }
        }
        int missing = -1;
        int j = 1;
        for (int i = 0; i < nes.size(); i++) {
            if (!nes.contains(j)) {
                missing = j;
            } else {
                j++;
            }
        }
        if (missing == -1 && j == nes.size() - 1) {
            missing = nes.size() + 1;
        } else {
            missing = j;
        }
        int[] arr = new int[2];
        arr[0] = nums[dublicate - 1];
        arr[1] = missing;
        return arr;
    }
}