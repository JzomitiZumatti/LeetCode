class Solution {
    public int countDigits(int num) {
        int counter = 0;
        for (Integer digit : digits(num)) {
            if (num % digit == 0) counter++;
        }
        return counter;
    }

    private static List<Integer> digits(int num) {
        List<Integer> dig = new ArrayList<>();
        while (num / 10 != 0) {
            int temp = num % 10;
            dig.add(temp);
            num /= 10;
        }
        dig.add(num);
        return dig;
    }
}