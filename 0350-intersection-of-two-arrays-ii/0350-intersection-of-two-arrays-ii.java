class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> num1Freq = new HashMap<>();
        Map<Integer, Integer> num2Freq = new HashMap<>();
        List<Integer> intersec = new ArrayList<>();
        for (int n : nums1) {
            num1Freq.put(n, num1Freq.getOrDefault(n, 0) + 1);
        }

        for (int n : nums2) {
            num2Freq.put(n, num2Freq.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> n : num1Freq.entrySet()) {
            if (num2Freq.containsKey(n.getKey())) {
                int counter = n.getValue() < num2Freq.get(n.getKey()) ? n.getValue() : num2Freq.get(n.getKey());
                while (counter != 0) {
                    intersec.add(n.getKey());
                    counter--;
                }
            }
        }
        return intersec.stream().mapToInt(i->i).toArray();
    }
}