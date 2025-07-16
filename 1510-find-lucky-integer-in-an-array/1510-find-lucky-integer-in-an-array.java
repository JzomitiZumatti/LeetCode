class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int counter = 1;
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] == arr[i - 1]) {
                counter++;
            } else {
                if (counter == arr[i]) {
                    return arr[i];
                }
                counter = 1;
            }
        }
        return (counter == arr[0]) ? arr[0] : -1;
    }
}