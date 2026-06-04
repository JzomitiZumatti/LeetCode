class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        char[][] ans = new char[boxGrid[0].length][boxGrid.length];
        for (int i = 0; i < boxGrid.length; i++) {
            int lastStar = boxGrid[0].length;
            int counterSharp = 0;
            for (int j = boxGrid[0].length - 1; j >= 0; j--) {
                if (boxGrid[i][j] == '#') counterSharp++;
                if (boxGrid[i][j] == '*') {
                    for (int k = lastStar - 1; k > j; k--) {
                        if (counterSharp > 0) {
                            boxGrid[i][k] = '#';
                            counterSharp--;
                        } else {
                            boxGrid[i][k] = '.';
                        }
                    }
                    lastStar = j;
                }
            }
            if (counterSharp > 0) {
                for (int k = lastStar - 1; k >= 0; k--) {
                    if (counterSharp > 0) {
                        boxGrid[i][k] = '#';
                        counterSharp--;
                    } else {
                        boxGrid[i][k] = '.';
                    }
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = boxGrid[boxGrid.length - 1 - j][i];
            }
        }
        return ans;
    }
}