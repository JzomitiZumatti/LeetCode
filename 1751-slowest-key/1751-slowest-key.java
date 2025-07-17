class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        int index = 0;
        for (int i = 1; i < releaseTimes.length; i++) {
            int n = releaseTimes[i] - releaseTimes[i - 1];
            if (n > max) {
                max = n;
                index = i;
            } else if (n == max) {
                if (keysPressed.charAt(i) > keysPressed.charAt(index)) {
                    index = i;
                }
            }
        }
        return keysPressed.charAt(index);
    }
}