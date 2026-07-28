class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int[] arr = new int[100];
        for (Integer bulb : bulbs) {
            arr[bulb - 1]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 != 0) ans.add(i + 1);
        }
        return ans;
    }
}