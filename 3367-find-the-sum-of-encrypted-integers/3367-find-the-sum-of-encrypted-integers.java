class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += newN(n);
        }
        return sum;
    }

    private static int newN(int n) {
        List<Integer> numbers = new ArrayList<>();
        while (n / 10 != 0) {
            int temp = n % 10;
            numbers.add(temp);
            n /= 10;
        }
        numbers.add(n);
        int max = Integer.MIN_VALUE;
        StringBuilder str = new StringBuilder();
        for (Integer numb : numbers) {
            max = Math.max(max, numb);
        }
        str.append(String.valueOf(max).repeat(numbers.size()));

        return Integer.parseInt(str.toString());
    }
}