class Solution {
    public int captureForts(int[] forts) {
        int left = 0;
        int right = forts.length - 1;
        int max = 0;
        while (left < forts.length) {
            if (forts[left] == 1) {
                left++;
                int counter = 0;
                while (left < forts.length) {
                    if (forts[left] == 1) break;
                    if (forts[left] == 0) counter++;
                    if (forts[left] == -1) {
                        max = Math.max(max, counter);
                        break;
                    }
                    left++;
                }
            } else left++;
        }
        while (right >= 0) {
            if (forts[right] == 1) {
                right--;
                int counter = 0;
                while (right >= 0) {
                    if (forts[right] == 1) break;
                    if (forts[right] == 0) counter++;
                    if (forts[right] == -1) {
                        max = Math.max(max, counter);
                        break;
                    }
                    right--;
                }
            } else right--;
        }
        return max;
    }
}