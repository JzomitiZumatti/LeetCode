class Solution {
    public int integerReplacement(int n) {
        long num = n;
        int counter = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
                counter++;
            } else {
                if (checker(num)) {
                    num = num + 1;
                } else {
                    num = num - 1;
                }
                counter++;
            }
        }
        return counter;
    }

    private boolean checker(long num) {
        long firstN = (num + 1) / 2;
        long secN = (num - 1) / 2;
        if (firstN == 1 && secN != 1) {
            return true;
        } else if (firstN != 1 && secN == 1) {
            return false;
        } else if (firstN % 2 == 0 && secN % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}