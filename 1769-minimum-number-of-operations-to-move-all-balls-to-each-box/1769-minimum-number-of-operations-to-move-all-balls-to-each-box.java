class Solution {
    public int[] minOperations(String boxes) {
        int[] boxesArr = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            boxesArr[i] = Integer.parseInt(String.valueOf(boxes.charAt(i)));
        }
        int[] res = new int[boxesArr.length];
        for (int i = 0; i < boxesArr.length; i++) {
            int sum = 0;
            for (int j = 0; j < boxesArr.length; j++) {
                if (i != j && boxesArr[j] == 1) {
                    sum += Math.abs(i - j);
                }
            }
            res[i] = sum;
        }
        return res;
    }
}