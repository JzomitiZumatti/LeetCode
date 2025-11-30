class Solution {
    public int divisorSubstrings(int num, int k) {
        int counter = 0;
        String number = String.valueOf(num);
        for (int i = 0; i + k <= number.length(); i++) {
            String substring = number.substring(i, i + k);
            int n = Integer.parseInt(substring);
            if (n != 0 && num % n == 0) counter++;
        }
        return counter;
    }
}