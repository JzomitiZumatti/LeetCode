class Solution {
    public int distinctIntegers(int n) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(n);
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1; j <= numbers.get(i); j++) {
                if (numbers.get(i) % j == 1) {
                    numbers.add(j);
                }
            }
        }

        Set<Integer> unique = new HashSet<>(numbers);
        return unique.size();
    }
}