class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        int counter = 1;
        int maxFreq = 0;
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] == arr[i - 1]) {
                counter++;
            } else {
                if (counter == arr[i]) {
                    if (counter > maxFreq) {
                        maxFreq = counter;
                        max = arr[i];
                    } else {
                        break;
                    }
                }
                counter = 1;
            }
        }
        if (counter > 0 && counter == arr[0]) {
            if (counter > maxFreq) {
                max = arr[0];
            }
        }
        return max != 0 ? max : -1;
    }
}