class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> unique = new HashMap<>();

        for (int n : nums) {
            unique.put(n,unique.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> u : unique.entrySet()) {
            if (u.getValue() == 1) {
                sum += u.getKey();
            }
        }

        return sum;
    }
}