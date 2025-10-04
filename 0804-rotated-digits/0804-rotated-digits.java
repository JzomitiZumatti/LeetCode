class Solution {
    public int rotatedDigits(int n) {
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            if (isGood(i)) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isGood(int n) {
        List<Integer> badNumbers = List.of(3,4,7);
        int newN = swapNumbers(n);
        if (newN == n) return false;
        while (newN / 10 != 0) {
            int temp = swapNumbers(newN % 10);
            if (badNumbers.contains(temp)) return false;
            newN = newN / 10;
        }
        return !badNumbers.contains(newN);
    }

    private static int swapNumbers(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n / 10 != 0) {
            int temp = n % 10;
            stringBuilder.append(swapper(temp));
            n = n / 10;
        }
        stringBuilder.append(swapper(n));
        return Integer.parseInt(stringBuilder.reverse().toString());
    }

    private static int swapper(int n) {
        return n % 10 == 2 ? 5 : n % 10 == 5 ? 2 : n % 10 == 6 ? 9 : n % 10 == 9 ? 6 : n % 10;
    }
}