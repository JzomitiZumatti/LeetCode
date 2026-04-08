class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int i = num1; i <= num2; i++) {
            ans += isWaviness(i);
        }
        return ans;
    }

    private static int isWaviness(int n) {
        if (n < 100) return 0;
        int res = 0;
        List<Integer> numbers = new ArrayList<>();
        while (n / 10 > 0) {
            int num = n % 10;
            numbers.add(num);
            n /= 10;
        }
        numbers.add(n);
        for (int i = 2; i < numbers.size(); i++) {
            int a = numbers.get(i - 2);
            int b = numbers.get(i - 1);
            int c = numbers.get(i);
            if (a < b && c < b) res++;
            if (a > b && c > b) res++;
        }
        return res;
    }
}