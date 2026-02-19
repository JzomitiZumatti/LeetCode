class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> freq = new ArrayList<>();
        int counter = 1;
        char previous = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (previous != current) {
                previous = current;
                freq.add(counter);
                counter = 1;
            } else counter++;
        }

        if (counter > 0) freq.add(counter);
        int res = 0;
        for (int i = 1; i < freq.size(); i++) {
            res += Math.min(freq.get(i - 1), freq.get(i));
        }
        return res;
    }
}