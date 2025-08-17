class Solution {
    public double minimumAverage(int[] nums) {
        PriorityQueue<Integer> sort = new PriorityQueue<>();
        PriorityQueue<Double> averages = new PriorityQueue<>();
        Deque<Integer> aor = new ArrayDeque<>();
        for (int n : nums) sort.add(n);
        while (!sort.isEmpty()) {
            int wl = sort.poll();
            aor.add(wl);
        }

        while (!aor.isEmpty()) {
            int min = aor.pollFirst();
            int max = aor.pollLast();
            double avg = (double) (min + max) / 2;
            averages.add(avg);
        }

        return !averages.isEmpty() ? averages.poll() : 0;
    }
}