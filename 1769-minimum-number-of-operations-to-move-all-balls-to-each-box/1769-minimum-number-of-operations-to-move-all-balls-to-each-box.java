class Solution {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int sum = 0;
            for (int j = 0; j < boxes.length(); j++) {
                int a = Integer.parseInt(String.valueOf(boxes.charAt(j)));
                if (i != j && a == 1) {
                    sum += Math.abs(i - j);
                }
            }
            res[i] = sum;
        }
        return res;
    }
}