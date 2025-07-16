class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        int counter = 1;
        int maxFreq = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                counter++;
            } else {
                if (counter == arr[i - 1]) {
                    if (counter > maxFreq) {
                        maxFreq = counter;
                        max = arr[i - 1];
                    }
                }
                counter = 1;
            }
        }
        if (counter > 0 && counter == arr[arr.length - 1]) {
            if (counter > maxFreq) {
                max = arr[arr.length - 1];
            }
        }
        return max != 0 ? max : -1;
    }
}