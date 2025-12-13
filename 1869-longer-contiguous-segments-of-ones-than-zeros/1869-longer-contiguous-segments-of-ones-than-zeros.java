class Solution {
    public boolean checkZeroOnes(String s) {
        if (s.length() == 1 && s.charAt(0) == '1') return true;
        int zeroMax = 0;
        int onesMax = 0;
        int zeroCounter = 0;
        int onesCounter = 0;
        for (int i = 1; i < s.length(); i++) {
            boolean b = s.charAt(i - 1) == s.charAt(i);
            if (b && s.charAt(i - 1) == '0') {
                if (onesCounter > 0) {
                    onesMax = Math.max(onesMax, onesCounter + 1);
                    onesCounter = 0;
                }
                zeroCounter++;
            } else if (b && s.charAt(i - 1) == '1') {
                if (zeroCounter > 0) {
                    zeroMax = Math.max(zeroMax, zeroCounter + 1);
                    zeroCounter = 0;
                }
                onesCounter++;
            } else {
                if (zeroCounter > 0) {
                    zeroMax = Math.max(zeroMax, zeroCounter + 1);
                    zeroCounter = 0;
                }
                if (onesCounter > 0) {
                    onesMax = Math.max(onesMax, onesCounter + 1);
                    onesCounter = 0;
                }
            }
        }
        if (zeroCounter > 0) {
            zeroMax = Math.max(zeroMax, zeroCounter + 1);
        }
        if (onesCounter > 0) {
            onesMax = Math.max(onesMax, onesCounter + 1);
        }
        return onesMax > zeroMax;
    }
}