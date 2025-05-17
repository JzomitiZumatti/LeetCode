class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] arr = new String[score.length];
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);
        reverseArray(sortedScore);
        int counter = 1;
        Map<Integer, String> scorePlace = new HashMap<>();
        for (int sorScore : sortedScore) {
            if (counter == 1) {
                scorePlace.put(sorScore, "Gold Medal");
                counter++;
            } else if (counter == 2) {
                scorePlace.put(sorScore, "Silver Medal");
                counter++;
            } else if (counter == 3) {
                scorePlace.put(sorScore, "Bronze Medal");
                counter++;
            } else {
                scorePlace.put(sorScore, String.valueOf(counter));
                counter++;
            }
        }
        int i = 0;
        do {
            arr[i] = scorePlace.get(score[i]);
            i++;
        } while (i < score.length);
        return arr;
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}