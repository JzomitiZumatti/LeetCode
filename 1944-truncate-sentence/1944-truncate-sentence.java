class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder res = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i == k - 1) {
                res.append(arr[i]);
                break;
            }
            res.append(arr[i]).append(" ");
        }
        return res.toString();
    }
}