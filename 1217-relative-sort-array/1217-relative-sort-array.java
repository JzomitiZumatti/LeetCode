class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] sorted = new int[arr1.length];
        Set<Integer> set = new HashSet<>();
        for (int a : arr2) {
            set.add(a);
        }
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int a : arr1) {
            numFreq.put(a, numFreq.getOrDefault(a, 0) + 1);
        }

        int j = 0;
        for (int a : arr2) {
            int counter = 0;
            while (counter < numFreq.get(a)) {
                sorted[j] = a;
                counter++;
                j++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int a : arr1) {
            if (!set.contains(a)) {
                list.add(a);
            }
        }
        Collections.sort(list);
        for (Integer i : list) {
            sorted[j] = i;
            j++;
        }

        return sorted;
    }
}