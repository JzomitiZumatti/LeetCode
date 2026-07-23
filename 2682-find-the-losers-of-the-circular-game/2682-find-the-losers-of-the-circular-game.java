class Solution {
    public int[] circularGameLosers(int n, int k) {
        int[] pa = new int[n];
        int i = 0;
        int j = 1;
        while (true) {
            pa[i]++;
            if (pa[i] > 1) break;
            i = (i + (k * j)) % n;
            j++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int l = 0; l < pa.length; l++) {
            if (pa[l] == 0) ans.add(l + 1);
        }
        return ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}