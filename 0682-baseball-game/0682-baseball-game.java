class Solution {
    public int calPoints(String[] operations) {
        LinkedList<Integer> score = new LinkedList<>();
        for (String operation : operations) {
            if (isStringInteger(operation)) {
                score.add(Integer.parseInt(operation));
            } else {
                if (operation.equals("C")) {
                    if (!score.isEmpty()) {
                        score.removeLast();
                    }
                }
                if (operation.equals("D")) {
                    score.add(score.getLast() * 2);
                }
                if (operation.equals("+")) {
                    int b = score.getLast();
                    score.removeLast();
                    int a = score.getLast();
                    int c = a + b;
                    score.add(b);
                    score.add(c);
                }
            }
        }
        int sum = 0;
        for (Integer s : score) {
            sum += s;
        }
        return sum;
    }

    private static boolean isStringInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}