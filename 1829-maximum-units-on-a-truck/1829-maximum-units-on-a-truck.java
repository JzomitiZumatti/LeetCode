class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        for (int[] box : boxTypes) {
            if (box[0] <= truckSize) {
                res += box[0] * box[1];
                truckSize -= box[0];
            } else {
                int i = 1;
                int nBox = box[0];
                while (nBox > truckSize) {
                    nBox = box[0] - i;
                    i++;
                }
                res += nBox * box[1];
                truckSize -= nBox;
            }
            if (truckSize == 0) break;
        }
        return res;
    }
}