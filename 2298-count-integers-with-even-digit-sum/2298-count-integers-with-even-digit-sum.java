class Solution {
    public int countEven(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (isEvenSumOfDigit(i)) counter++;
        }
        return counter;
    }
    
    private static boolean isEvenSumOfDigit(int n) {
        int sum = 0;
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return sum % 2 == 0;
    }
}