class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xClosest = Math.max(Math.min(x1, x2), Math.min(Math.max(x1, x2), xCenter));
        int yClosest = Math.max(Math.min(y1, y2), Math.min(Math.max(y1, y2), yCenter));
        int l = (int) (Math.pow((xCenter - xClosest), 2) + Math.pow((yCenter - yClosest), 2));
        return l <= (int) Math.pow(radius, 2);
    }
}