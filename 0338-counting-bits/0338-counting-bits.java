class Solution {
    public int[] countBits(int n) {
        int[] sumBit = new int[n + 1];
	    for (int i = 0; i <= n; i++) {
	        int sum = 0;
	        int currentBit = i;
	        while (currentBit / 2 != 0) {
	            sum += currentBit % 2;
	            currentBit /= 2;
	        }
	        sumBit[i] = (sum + currentBit % 2);
	    }
        return sumBit;
    }
}