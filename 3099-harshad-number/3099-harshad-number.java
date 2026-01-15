class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if (x % sumOfNumbers(x) == 0) return sumOfNumbers(x);
        else  return -1;
    }

    private static int sumOfNumbers(int n) {
        String a = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            int temp = Integer.parseInt(String.valueOf(a.charAt(i)));
            sum += temp;
        }
        return sum;
    }
}