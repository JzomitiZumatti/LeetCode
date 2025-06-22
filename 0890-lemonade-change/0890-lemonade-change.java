class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> availableNotes = new HashMap<>(); //value, quantity
        for (int b : bills) {
            if (b == 5) availableNotes.put(b, availableNotes.getOrDefault(b, 0) + 1);
            if (b == 10) {
                if (availableNotes.containsKey(5) && availableNotes.get(5) >= 1) {
                    availableNotes.put(5, availableNotes.getOrDefault(5, 0) - 1);
                    availableNotes.put(b, availableNotes.getOrDefault(b, 0) + 1);
                } else {
                    return false;
                }
            }
            if (b == 20) {
                if (availableNotes.containsKey(5) && availableNotes.get(5) >= 1
                        && availableNotes.containsKey(10) && availableNotes.get(10) >= 1) {
                    availableNotes.put(10, availableNotes.getOrDefault(10, 0) - 1);
                    availableNotes.put(5, availableNotes.getOrDefault(5, 0) - 1);
                } else if (availableNotes.containsKey(5) && availableNotes.get(5) >= 3) {
                    availableNotes.put(5, availableNotes.getOrDefault(5, 0) - 3);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}