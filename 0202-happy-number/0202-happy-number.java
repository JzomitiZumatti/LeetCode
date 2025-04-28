class Solution {
    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        while (n != 1) {
            int temp = n;
            int sum = 0;
            do {
                int digit = temp % 10;
                temp = temp / 10;
                sum += digit * digit;
            } while (temp > 0);
            n = sum;
            if (numbers.contains(n)) {
                break;
            } else {
                numbers.add(n);
            }
        }
        return n == 1;
    }
}