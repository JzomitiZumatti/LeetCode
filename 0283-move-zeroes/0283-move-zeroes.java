class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (num != 0) {
                list.add(num);
            }
        }
        
        while (list.size() < nums.length) {
            list.add(0);
        }
        int[] temp = list.stream().mapToInt(Integer::intValue).toArray();
        System.arraycopy(temp, 0, nums, 0, temp.length);
    }
}