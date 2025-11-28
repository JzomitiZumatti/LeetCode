class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        Map<Character, Integer> characterFreq = new HashMap<>();
        for (int i = 0; i < moves.length(); i++) {
            characterFreq.put(moves.charAt(i), characterFreq.getOrDefault(moves.charAt(i), 0) + 1);
        }
        int max = 0;
        char c = 'R';
        for (Map.Entry<Character, Integer> entry : characterFreq.entrySet()) {
            if ((entry.getKey() == 'L' || entry.getKey() == 'R') && max < entry.getValue()) {
                max = entry.getValue();
                c = entry.getKey();
            }
        }
        int counter = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') counter--;
            else if (moves.charAt(i) == 'R') counter++;
            else {
                if (c == 'L') counter--;
                else counter++;
            }
        }
        return Math.abs(counter);
    }
}