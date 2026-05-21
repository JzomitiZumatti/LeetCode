class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int[] freqs = getFreqs(digits);
        for (int i = 100; i <= 998; i++) {
            if (i % 2 == 0) {
                boolean isFit = true;
                int[] numFreqs = getNumFreqs(i);
                for (int j = 0; j < numFreqs.length; j++) {
                    if (freqs[j] < numFreqs[j]) {
                        isFit = false;
                        break;
                    }
                }
                if (isFit) list.add(i);
            }
        }
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    private static int[] getFreqs(int[] arr) {
        int[] ans = new int[10];
        for (int i : arr) {
            ans[i]++;
        }
        return ans;
    }

    private static int[] getNumFreqs(int n) {
        int[] ans = new int[10];
        while (n / 10 != 0) {
            int temp = n % 10;
            ans[temp]++;
            n /= 10;
        }
        ans[n]++;
        return ans;
    }
}