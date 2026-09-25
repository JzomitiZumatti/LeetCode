class Solution {
    public int getKth(int lo, int hi, int k) {
        Map<Integer, Integer> numPow = new HashMap<>();
        for (int i = lo; i <= hi; i++) {
            numPow.put(i, pow(i));
        }
        Map<Integer, Integer> sorted = numPow.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        List<Integer> sortedByPow = new ArrayList<>(sorted.keySet());
        return sortedByPow.get(k - 1);
    }

    private static int pow(int n) {
        int counter = 0;
        while (n > 1) {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            counter++;
        }
        return counter;
    }
}