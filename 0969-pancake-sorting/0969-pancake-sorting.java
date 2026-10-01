class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        while (n > 0) {
            int p = findMaxPos(arr, n);
            ans.add(p);
            reverseArray(arr, p);
            reverseArray(arr, n);
            ans.add(n);
            n--;
        }
        return ans;
    }

    private static int findMaxPos(int[] arr, int n) {
        int pos = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                pos = i;
            }
        }
        return pos + 1;
    }

    public static void reverseArray(int[] array, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}