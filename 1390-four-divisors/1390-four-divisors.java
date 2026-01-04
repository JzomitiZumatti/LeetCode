class Solution {
    public int sumFourDivisors(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : numFreq.entrySet()) {
            if (divisors(entry.getKey()).size() == 4) {
                sum += entry.getValue() * sumOfElements(divisors(entry.getKey()));
            }
        }
        return sum;
    }

    private static Set<Integer> divisors(int n) {
        Set<Integer> res = new HashSet<>();
        res.add(1);
        res.add(n);
        int counter = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res.add(i);
                counter++;
                if (counter > 2) return new HashSet<>();
            }
        }
        return res;
    }

    private static int sumOfElements(Set<Integer> set) {
        int sum = 0;
        for (Integer i : set) {
            sum += i;
        }
        return sum;
    }
}