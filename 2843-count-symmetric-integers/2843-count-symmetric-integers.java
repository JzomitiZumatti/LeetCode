class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int counter = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) counter++;
        }
        return counter;
    }

    private static boolean isSymmetric(int a) {
        String number = String.valueOf(a);
        int left = 0;
        int right = 0;
        if (number.length() % 2 == 0) {
            for (int i = 0; i < number.length(); i++) {
                int temp = Integer.parseInt(String.valueOf(number.charAt(i)));
                if (i < number.length() / 2) left += temp;
                else right += temp;
            }
        } else return false;
        return left == right;
    }
}