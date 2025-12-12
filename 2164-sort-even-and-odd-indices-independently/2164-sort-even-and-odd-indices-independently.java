class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> oddSorted = new ArrayList<>();
        List<Integer> evenSorted = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) oddSorted.add(nums[i]);
            else evenSorted.add(nums[i]);
        }
        oddSorted.sort(Integer::compareTo);
        evenSorted.sort(Integer::compareTo);
        int o = oddSorted.size() - 1;
        int e = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                nums[i] = oddSorted.get(o);
                o--;
            } else {
                nums[i] = evenSorted.get(e);
                e++;
            }
        }
        return nums;
    }
}