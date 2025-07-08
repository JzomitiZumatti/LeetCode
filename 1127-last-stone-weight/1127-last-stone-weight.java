class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> ston = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            ston.add(s);
        }
        while (ston.size() > 1) {
            int dif = ston.poll() - ston.poll();
            if (dif != 0) {
                ston.add(dif);
            }
        }
        return !ston.isEmpty() ? ston.peek() : 0;
    }
}