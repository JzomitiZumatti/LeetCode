class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizBuzChecked = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            fizBuzChecked.add(checkNum(i));
        }
        return fizBuzChecked;
    }

    public static String checkNum(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
}