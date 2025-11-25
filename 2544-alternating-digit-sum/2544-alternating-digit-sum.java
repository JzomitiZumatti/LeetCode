class Solution {
    public int alternateDigitSum(int n) {
        List<Integer> nums = new ArrayList<>();
        int sum = 0;
        while (n / 10 != 0) {
            nums.add(n % 10);
            n /= 10;
        }
        nums.add(n);
        int i = 1;
        for (int j = nums.size() - 1; j >= 0; j--) {
            if (i % 2 != 0) sum += nums.get(j);
            else sum -= nums.get(j);
            i++;
        }
        return sum;
    }
}