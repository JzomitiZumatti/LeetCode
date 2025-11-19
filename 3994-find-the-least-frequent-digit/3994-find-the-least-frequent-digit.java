class Solution {
    public int getLeastFrequentDigit(int n) {
        String number = String.valueOf(n);
        Map<Integer, Integer> numberFreq = new HashMap<>();
        for (int i = 0; i < number.length(); i++) {
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            numberFreq.put(num, numberFreq.getOrDefault(num, 0) + 1);
        }
        int minNumber = Integer.MAX_VALUE;
        int minFreq = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : numberFreq.entrySet()) {
            if (entry.getValue() < minFreq) {
                minFreq = entry.getValue();
                minNumber = entry.getKey();
            }
        }
        return minNumber;
    }
}