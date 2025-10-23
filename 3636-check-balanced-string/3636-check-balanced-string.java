class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < num.length(); i++) {
            int number = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (i % 2 == 0) evenSum += number;
            else oddSum += number;
        }
        return evenSum == oddSum;
    }
}