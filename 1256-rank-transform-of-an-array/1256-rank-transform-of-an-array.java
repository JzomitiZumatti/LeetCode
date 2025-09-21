class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] res = new int[arr.length];
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        Map<Integer, Integer> numScore = new HashMap<>();
        int j = 1;
        for (int k : copy) {
            boolean flag = numScore.containsKey(k);
            numScore.put(k, numScore.getOrDefault(k, j));
            if (!flag) j++;
        }
        System.out.println(numScore);
        for (int i = 0; i < arr.length; i++) {
            res[i] = numScore.get(arr[i]);
        }
        return res;
    }
}