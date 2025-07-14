class Solution {
    public int findSpecialInteger(int[] arr) {
        List<Integer> freq = new ArrayList<>();
        List<Integer> unique = new ArrayList<>();
        int counter = 0;
        int currentI = 0;
        for (int i = 0; i < arr.length; i++) {
            currentI = i;
            int next = i + 1 < arr.length ? i + 1 : i;
            if (arr[i] == arr[next]) {
                counter++;
                if (counter == arr.length) {
                    freq.add(counter);
                    unique.add(arr[i]);
                    counter = 0;
                }
            } else {
                unique.add(arr[i]);
                freq.add(counter);
                counter = 0;
            }
        }
        if (counter != 0) {
            freq.add(counter);
            unique.add(arr[currentI]);
        }
        int max = 0;
        int index = -1;
        for (int i = 0; i < freq.size(); i++) {
            if (freq.get(i) > max) {
                max = freq.get(i);
                index = i;
            }
        }
        return unique.get(index);
    }
}