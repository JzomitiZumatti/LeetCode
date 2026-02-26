import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        int counter = 0;
        BigInteger n = new BigInteger(s, 2);
        while (n.compareTo(BigInteger.ONE) > 0) {
            boolean isEven = n.mod(BigInteger.TWO).equals(BigInteger.ZERO);
            if (isEven) n = n.divide(BigInteger.TWO);
            else n = n.add(BigInteger.ONE);
            counter++;
        }
        return counter;
    }
}