class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        boolean[][] deck = new boolean[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                deck[i][j] = (i + j) % 2 == 0;
            }
        }
        char[] letters = new char[8];
        for (int i = 0; i < 8; i++) {
            letters[i] = (char) ('a' + i);
        }

        int first = -1;
        int second = -1;
        for (int i = 0; i < letters.length; i++) {
            if (coordinate1.charAt(0) == letters[i]) {
                first = i;
            }
        }
        for (int i = 0; i < letters.length; i++) {
            if (coordinate2.charAt(0) == letters[i]) {
                second = i;
            }
        }
        return deck[first][Integer.parseInt(String.valueOf(coordinate1.charAt(1))) - 1] ==
                deck[second][Integer.parseInt(String.valueOf(coordinate2.charAt(1))) - 1];
    }
}