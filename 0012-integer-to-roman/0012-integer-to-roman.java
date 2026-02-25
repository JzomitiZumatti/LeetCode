class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> sorted = getIntegerStringMap();
        int n = num;
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Integer, String> entry : sorted.entrySet()) {
            while (n - entry.getKey() >= 0) {
                stringBuilder.append(entry.getValue());
                n -= entry.getKey();
            }
        }
        return stringBuilder.toString();
    }

    private static Map<Integer, String> getIntegerStringMap() {
        Map<Integer, String> intRom = new HashMap<>();
        intRom.put(1000, "M");
        intRom.put(900, "CM");
        intRom.put(500, "D");
        intRom.put(400, "CD");
        intRom.put(100, "C");
        intRom.put(90, "XC");
        intRom.put(50, "L");
        intRom.put(40, "XL");
        intRom.put(10, "X");
        intRom.put(9, "IX");
        intRom.put(5, "V");
        intRom.put(4, "IV");
        intRom.put(1, "I");
        Map<Integer, String> sorted = new TreeMap<>(Collections.reverseOrder());
        sorted.putAll(intRom);
        return sorted;
    }
}