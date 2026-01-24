class Solution {
    public String toHex(int num) {
        return num >= 0 ? positiveToHex(num) : negativeToHex(num);
    }

    private static String positiveToHex(int num) {
        Map<Integer, Character> numChar = new HashMap<>();
        char j = 'a';
        for (int i = 0; i <= 15; i++) {
            if (i < 10) numChar.put(i, (char) (i + '0'));
            else {
                numChar.put(i, j);
                j++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (num / 16 != 0) {
            int temp = num % 16;
            stringBuilder.append(numChar.get(temp));
            num /= 16;
        }
        stringBuilder.append(numChar.get(num));
        return stringBuilder.reverse().toString();
    }

    private static String negativeToHex(int num) {
        Map<Integer, Character> numChar = new HashMap<>();
        char j = 'a';
        for (int i = 0; i <= 15; i++) {
            if (i < 10) numChar.put(i, (char) (i + '0'));
            else {
                numChar.put(i, j);
                j++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder.append(String.format("%32s", Integer.toBinaryString(num  * -1)).replace(' ', '0'));
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '0') stringBuilder1.append('1');
            else stringBuilder1.append('0');
        }
        stringBuilder.setLength(0);
        long a = Long.parseLong(stringBuilder1.toString(), 2);
        long sum = a + 1;
        stringBuilder.append(String.format("%32s", Long.toBinaryString(sum)).replace(' ', '0'));
        stringBuilder1.setLength(0);
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < stringBuilder.length(); i = i + 4) {
            strings.add(stringBuilder.substring(i, i + 4));
        }
        for (String el : strings) {
            stringBuilder1.append(numChar.get(Integer.parseInt(el, 2)));
        }
        return stringBuilder1.toString();
    }
}