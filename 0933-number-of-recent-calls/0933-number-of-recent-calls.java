class RecentCounter {
    private int requests;
    private Queue<Integer> pingHistory;

    public RecentCounter() {
        pingHistory = new ArrayDeque<>();
        requests = 0;
    }
    
    public int ping(int t) {
        pingHistory.add(t);
        return countCalls(t, pingHistory);
    }

    private static int countCalls(int t, Queue<Integer> pingHistory) {
        int min = t - 3000;
        while (!pingHistory.isEmpty()) {
            int n = pingHistory.peek();
            if (n < min) pingHistory.poll();
            else break;
        }
        return pingHistory.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */