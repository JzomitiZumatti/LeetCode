class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> missing = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < arr.length + k; i++) {
            int index = i < arr.length ? i : arr.length - 1;
            counter++;
            if (counter != arr[index] && counter <= arr[arr.length - 1]) {
                while (counter < arr[index]) {
                    missing.add(counter);
                    counter++;
                }
            } else if (counter > arr[arr.length - 1]) {
                missing.add(counter);
            }
        }
        return missing.get(k - 1);
    }
}