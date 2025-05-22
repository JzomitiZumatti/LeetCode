class Solution {
    public static int findComplement(int num) {
        List<Integer> numTwo = new ArrayList<>();
        int number = 0;
        while (num > 0) {
            numTwo.add(num % 2);
            num = num / 2;
        }
        numTwo.replaceAll(integer -> integer ^ 1);

        for (int i = 0; i < numTwo.size(); i++) {
            number += numTwo.get(i) * (int)Math.pow(2, i);
        }
        return number;
    }
}