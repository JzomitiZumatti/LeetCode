class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> sortNum = new ArrayList<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                sortNum.addFirst(n);
            } else {
                sortNum.addLast(n);
            }
        }
        return sortNum.stream().mapToInt(Integer::intValue).toArray();
    }
}