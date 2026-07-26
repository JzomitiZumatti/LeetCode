class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0];
        int x2 = rec1[2];
        int y1 = rec1[1];
        int y2 = rec1[3];
        int X1 = rec2[0];
        int X2 = rec2[2];
        int Y1 = rec2[1];
        int Y2 = rec2[3];
        if (x2 <= X1 || y2 <= Y1 || X2 <= x1 || Y2 <= y1) return false;
        return true;
    }
}