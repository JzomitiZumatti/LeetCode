class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, List<Integer>> numList = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            numList.putIfAbsent(sumOfDigit(i), new ArrayList<>());
            numList.get(sumOfDigit(i)).add(i);
        }
        int maxSize = 0;
        for (List<Integer> value : numList.values()) {
            maxSize = Math.max(maxSize, value.size());
        }
        int counter = 0;
        for (List<Integer> value : numList.values()) {
            if (value.size() == maxSize) counter++;
        }
        return counter;
    }

    private static int sumOfDigit(int n) {
        int ans = 0;
        while (n / 10 != 0) {
            ans += n % 10;
            n /= 10;
        }
        ans += n;
        return ans;
    }
}