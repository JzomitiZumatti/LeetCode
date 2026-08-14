class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int n : deck) {
            numFreq.put(n, numFreq.getOrDefault(n, 0) + 1);
        }
        int[] arr = new int[numFreq.size()];
        int i = 0;
        for (Integer value : numFreq.values()) {
            arr[i] = value;
            i++;
        }
        return findArrayGCD(arr) > 1;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int findArrayGCD(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
}