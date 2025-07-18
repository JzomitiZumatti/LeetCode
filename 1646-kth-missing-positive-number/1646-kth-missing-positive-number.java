class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= arr[arr.length - 1] + k; i++) {
            missing.add(i);
        }
        for (int a : arr) {
            if (missing.contains(a)) {
                missing.remove((Object) a);
            }
        }
        return missing.get(k - 1);
    }
}