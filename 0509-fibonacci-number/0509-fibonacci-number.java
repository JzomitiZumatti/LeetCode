class Solution {
    public int fib(int n) {
        int[] fibSol = new int[n + 1];
        fibSol[0] = 0;
        if (n > 0) {
            fibSol[1] = 1;
            for (int i = 2; i <= n; i++) {
                fibSol[i] = fibSol[i - 1] + fibSol[i - 2];
            }
        }
        return fibSol[n];
    }
}