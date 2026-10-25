class Solution {
    public int hIndex(int[] citations) {
        int ans = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int c = citations[i];
            if (c <= citations.length - i) ans = Math.max(ans, c);
            else ans = Math.max(ans, citations.length - i);
        }
        return ans;
    }
}