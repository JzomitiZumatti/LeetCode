class Solution {
    public int smallestNumber(int n, int t) {
        List<Integer> nums = new ArrayList<>();
        int num = n;
        int p = prod(num);
        if (p % t == 0) return num;
        int i = 1;
        while (p % t != 0) {
            num += i;
            p = prod(num);
            if (p % t == 0) return num;
        }
        return num;
    }

    private static int prod(int n) {
        List<Integer> nums = new ArrayList<>();
        while (n / 10 != 0) {
            nums.add(n % 10);
            n /= 10;
        }
        nums.add(n);
        int prod = 1;
        for (Integer number : nums) {
            prod *= number;
        }
        return prod;
    }
}