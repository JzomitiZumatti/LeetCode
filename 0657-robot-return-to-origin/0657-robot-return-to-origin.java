class Solution {
    public boolean judgeCircle(String moves) {
        int[] pos = new int[] {0, 0};
        String[] commands = moves.split("");
        for (String command : commands) {
            switch (command) {
                case "R" -> pos[0] += 1;
                case "L" -> pos[0] -= 1;
                case "U" -> pos[1] += 1;
                case "D" -> pos[1] -= 1;
            }
        }
        return pos[0] == 0 && pos[1] == 0;
    }
}