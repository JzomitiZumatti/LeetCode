class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1;) {
            int prev = mountain[i - 1];
            int cur = mountain[i];
            int next = mountain[i + 1];
            if (cur > prev && cur > next) {
                peaks.add(i);
                i = i + 2;
            } else {
                i++;
            }
        }
        return peaks;
    }
}