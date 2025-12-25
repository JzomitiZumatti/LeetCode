class Solution {
    public int passThePillow(int n, int time) {
        int dir = 1;
        int pos = 1;
        int counter = 0;
        while (counter < time) {
            if (pos == n) dir = -1;
            if (pos == 1) dir = 1;
            pos += dir;
            counter++;
        }
        return pos;
    }
}