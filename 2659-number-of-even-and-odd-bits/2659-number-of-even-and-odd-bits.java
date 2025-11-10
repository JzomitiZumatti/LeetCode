class Solution {
    public int[] evenOddBit(int n) {
        int oddCounter = 0;
        int evenCounter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toBinaryString(n)).reverse();
        for (int i = 0; i <stringBuilder.length(); i++) {
            if (Integer.parseInt(String.valueOf(stringBuilder.charAt(i))) == 1) {
                System.out.println(i);
                if (i % 2 == 0) evenCounter++;
                else oddCounter++;
            }
        }
        return new int[]{evenCounter, oddCounter};
    }
}