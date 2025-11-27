class Solution {
    public boolean checkDivisibility(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int number = n;
        while (number / 10 != 0) {
            stringBuilder.append(number % 10);
            number /= 10;
        }
        stringBuilder.append(number);
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < stringBuilder.length(); i++) {
            int num = Integer.parseInt(String.valueOf(stringBuilder.toString().charAt(i)));
            sum += num;
            prod *= num;
        }
        return n % (sum + prod) == 0;
    }
}