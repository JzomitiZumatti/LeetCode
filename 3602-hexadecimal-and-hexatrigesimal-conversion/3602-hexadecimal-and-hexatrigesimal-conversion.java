class Solution {
    public String concatHex36(int n) {
        return decimalToHexadecimal(n) + decimalToHexatrigesimal(n);
    }

    private static String decimalToHexadecimal(int n) {
        n = n * n;
        Map<Integer, Character> numberLetter = new HashMap<>();
        int i = 10;
        for (char c = 'A'; c <= 'F'; c++) {
            numberLetter.put(i, c);
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (n / 16 != 0) {
            int temp = n % 16;
            System.out.println(temp);
            if (temp < 10) stringBuilder.append(temp);
            else stringBuilder.append(numberLetter.get(temp));
            n /= 16;
        }
        if (n < 10) stringBuilder.append(n);
        else stringBuilder.append(numberLetter.get(n));
        return stringBuilder.reverse().toString();
    }

    private static String decimalToHexatrigesimal(int n) {
        n = n * n * n;
        Map<Integer, Character> numberLetter = new HashMap<>();
        int i = 10;
        for (char c = 'A'; c <= 'Z'; c++) {
            numberLetter.put(i, c);
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (n / 36 != 0) {
            int temp = n % 36;
            System.out.println(temp);
            if (temp < 10) stringBuilder.append(temp);
            else stringBuilder.append(numberLetter.get(temp));
            n /= 36;
        }
        if (n < 10) stringBuilder.append(n);
        else stringBuilder.append(numberLetter.get(n));
        return stringBuilder.reverse().toString();
    }
}