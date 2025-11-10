class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> numberFreq = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            Integer number = Integer.parseInt(String.valueOf(num.charAt(i)));
            numberFreq.put(number, numberFreq.getOrDefault(number, 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            int number = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (!Objects.equals(numberFreq.getOrDefault(i, 0), number)) return false;
        }
        return true;
    }
}