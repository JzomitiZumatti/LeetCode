class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] ans = new int[n][n];
        Map<String, Integer> arrFreq = new HashMap<>();
        for (int[] query : queries) {
            String s = arrToString(query);
            arrFreq.put(s, arrFreq.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : arrFreq.entrySet()) {
            int[] arr = stringToArr(entry.getKey());
            int freq = entry.getValue();
            for (int i = arr[0]; i <= arr[2]; i++) {
                for (int j = arr[1]; j <= arr[3]; j++) {
                    ans[i][j] = ans[i][j] + freq;
                }
            }
        }
        return ans;
    }

    private static String arrToString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) stringBuilder.append(arr[i]).append(',');
            else stringBuilder.append(arr[i]);
        }
        return stringBuilder.toString();
    }

    private static int[] stringToArr(String s) {
        String[] sArr = s.split(",");
        int[] arr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }
        return arr;
    }
}