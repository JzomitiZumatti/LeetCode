class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stud = new LinkedList<>();
        Queue<Integer> sand = new LinkedList<>();
        for (int i = 0; i < sandwiches.length; i++) {
            stud.add(students[i]);
            sand.add(sandwiches[i]);
        }

        int counter = 0;

        int iter = 0;
        while (!sand.isEmpty() && !stud.isEmpty()) {
            if (Objects.equals(stud.peek(), sand.peek())) {
                stud.poll();
                sand.poll();
                counter++;
            } else {
                Integer temp = stud.poll();
                stud.add(temp);
                iter++;
                if (iter > students.length * students.length) break;
            }
        }

        return students.length - counter;
    }
}