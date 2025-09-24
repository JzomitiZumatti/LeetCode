class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int i : arr) {
            numFreq.put(i, numFreq.getOrDefault(i, 0) + 1);
        }

        int[] freq = new int[numFreq.size()];
        int j = 0;
        for (Integer value : numFreq.values()) {
            freq[j] = value;
            j++;
        }
        int counter = 0;
        int sum = 0;
        Arrays.sort(freq);
        for (int i = freq.length - 1; i >= 0; i--) {
            sum += freq[i];
            counter++;
            if (sum >= arr.length / 2) return counter;
        }
        return 1;
    }
}