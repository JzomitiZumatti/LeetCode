class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int max = Integer.MIN_VALUE;
        for (int workerTime : workerTimes) {
            max = Math.max(max, workerTime);
        }
        long m = 0;
        for (long i = 1; i <= mountainHeight; i++) {
            m += max * i;
        }

        return binarySearch(m, mountainHeight, workerTimes);
    }

    private static long binarySearch(long m, int mountainHeight, int[] workerTimes) {
        long left = 0;
        long right = m;
        while (left <= right) {
            long sum = 0;
            long mid = left + (right - left) / 2;

            for (int workerTime : workerTimes) {
                long localSum = 0;
                long i = 0;
                while (localSum <= mid) {
                    localSum += workerTime * (i + 1);
                    i++;
                }
                sum += i - 1;
                if (sum >= mountainHeight) break;
            }
            if (sum >= mountainHeight) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
}