class Solution {
    public int findSpecialInteger(int[] arr) {
        int maxSeries = 0;
        int index = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int next = i + 1 < arr.length ? i + 1 : i;
            if (arr[i] == arr[next]) {
                counter++;
                if (counter == arr.length) {
                    return arr[i];
                }
            } else {
                if (counter > maxSeries) {
                    maxSeries = counter;
                    index = i;
                }
                counter = 0;
            }
        }
        if (counter > 0 && counter > maxSeries) {
            return arr[arr.length - 1];
        }
        return arr[index];
    }
}