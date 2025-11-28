class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lCounter = 0;
        int rCounter = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') lCounter++;
            if (moves.charAt(i) == 'R')  rCounter++;
        }
        char c = lCounter > rCounter ? 'L' : 'R';
        int counter = 0;
        for (int i = 0; i < moves.length(); i++) {
            counter = moves.charAt(i) == 'L' ? counter - 1 : moves.charAt(i) == 'R' ? counter + 1 :
                    c == 'L' ? counter - 1 : counter + 1;
        }
        return Math.abs(counter);
    }
}