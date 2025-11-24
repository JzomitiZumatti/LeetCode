class Solution {
    public int splitNum(int num) {
        List<Integer> nums = new ArrayList<>();
        while (num / 10 != 0) {
            nums.add(num % 10);
            num /= 10;
        }
        nums.add(num);
        nums.sort(Integer::compareTo);
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 == 0) two.append(nums.get(i));
            else one.append(nums.get(i));
        }
        return Integer.parseInt(one.toString()) + Integer.parseInt(two.toString());
    }
}