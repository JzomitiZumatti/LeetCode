class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int counter = 0;
        PriorityQueue<Integer> seat = new PriorityQueue<>();
        PriorityQueue<Integer> stud = new PriorityQueue<>();
        for (int i = 0; i < seats.length; i++) {
            seat.add(seats[i]);
            stud.add(students[i]);
        }

        while (!seat.isEmpty() && !stud.isEmpty()) {
            counter += Math.abs(seat.poll() - stud.poll());
        }
        return counter;
    }
}