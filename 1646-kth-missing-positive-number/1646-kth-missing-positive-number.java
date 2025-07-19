class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> missing = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < arr.length + k; i++) {
            int index = i < arr.length ? i : arr.length - 1;
            counter++;
            System.out.println(counter + " " + arr[index]);
            if (counter != arr[index] && counter <= arr[arr.length - 1] && missing.size() <= k) {
                while (counter < arr[index]) {
                    missing.add(counter);
                    counter++;
                }
            } else if (counter > arr[arr.length - 1] && missing.size() <= k) {
                missing.add(counter);
            }
        }
        System.out.println(missing);
        return missing.get(k - 1);
    }
}