class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int length = score[0].length;
        int[][] sorted = new int[score.length][length];
        Set<Integer> isChecked = new HashSet<>();
        int p = 0;
        while (p < score.length) {
            int max = 0;
            int maxValue = Integer.MIN_VALUE;
            for (int i = 0; i < score.length; i++) {
                if (score[i][k] > maxValue && !isChecked.contains(i)) {
                    maxValue = score[i][k];
                    max = i;
                }
            }
            int[] temp = new int[length];
            int j = 0;
            for (int i = 0; i < length; i++) {
                temp[j] = score[max][i];
                j++;
            }
            sorted[p] = temp;
            isChecked.add(max);
            p++;
        }
        return sorted;
    }
}