class Solution {
    private int[] genuine;

    public Solution(int[] arr) {
        this.genuine = Arrays.copyOf(arr, arr.length);
    }

    public int[] reset() {
        return genuine;
    }

    public int[] shuffle() {
        int[] copy = Arrays.copyOf(genuine, genuine.length);
        Random rnd = new Random();
        for (int i = copy.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = copy[index];
            copy[index] = copy[i];
            copy[i] = a;
        }
        return copy;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */