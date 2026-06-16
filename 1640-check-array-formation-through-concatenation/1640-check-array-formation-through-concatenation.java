class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Set<Integer> nums = new HashSet<>();
        for (int n : arr) {
            nums.add(n);
        }
        for (int[] piece : pieces) {
            for (int p : piece) {
                if (!nums.contains(p)) return false;
            }
        }
        if (arr.length == pieces.length) return true;
        for (int[] piece : pieces) {
            if (piece.length > 1) {
                int[] ar = new int[piece.length];
                int j = 0;
                boolean flag = false;
                for (int i = 0; i < arr.length; i++) {
                    if (flag) {
                        ar[j] = arr[i];
                        j++;
                    }
                    if (piece[0] == arr[i]) {
                        ar[j] = arr[i];
                        j++;
                        flag = true;
                    }
                    if (j >= piece.length) break;
                }
                if (!Arrays.equals(piece, ar)) return false;
            }
        }
        return true;
    }
}