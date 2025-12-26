class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder numWithoutZeros = new StringBuilder();
        long sum = 0;
        for (Integer num : nonZeroList(n)) {
            numWithoutZeros.append(num);
            sum += num;
        }
        long newNumber = Long.parseLong(numWithoutZeros.reverse().toString());
        return sum * newNumber;
    }

    private static List<Integer> nonZeroList(int n) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (n / 10 != 0) {
            int temp = n % 10;
            if (temp != 0) list.add(temp);
            n /= 10;
        }
        list.add(n);
        return list;
    }
}