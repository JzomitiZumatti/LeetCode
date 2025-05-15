class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> uniqueNums = new TreeSet<>(Collections.reverseOrder());
        for (int n : nums) {
            uniqueNums.add(n);
        }
        return uniqueNums.size() >= 3 ? uniqueNums.stream().skip(2).findFirst().get() : uniqueNums.first();
    }
}