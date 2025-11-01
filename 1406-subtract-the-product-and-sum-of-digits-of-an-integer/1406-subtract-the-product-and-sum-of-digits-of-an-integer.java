class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        for (Integer num : listOfNumber(n)) {
            prod *= num;
            sum += num;
        }
        return prod - sum;
    }

    private static List<Integer> listOfNumber(int n) {
        List<Integer> list = new ArrayList<>();
        while (n / 10 != 0) {
            list.add(n % 10);
            n /= 10;
        }
        list.add(n);
        return list;
    }
}