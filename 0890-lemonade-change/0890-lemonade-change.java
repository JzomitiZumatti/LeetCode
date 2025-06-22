class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int b : bills) {
            if (b == 5) five++;
            if (b == 10) {
                if (five >= 1) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            }
            if (b == 20) {
                if (five >= 1 && ten >= 1) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}