class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];
        for (int i = 0; i < word.length(); i++) {
            int pos = word.charAt(i) - 'a';
            freq[pos] ++;
        }
        List<Integer> freqs = new ArrayList<>();
        for (int i : freq) {
            if (i > 0) freqs.add(i);
        }
        int i = 0;
        while (i < freqs.size()) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < freqs.size(); j++) {
                if (i != j) {
                    min = Math.min(min, freqs.get(j));
                    max = Math.max(max, freqs.get(j));
                }
            }
            if (freqs.get(i) - 1 > 0) {
                min = Math.min(min, freqs.get(i) - 1);
                max = Math.max(max, freqs.get(i) - 1);
            }
            if (Math.abs(min - max) == 0) return true;
            i++;
        }
        return false;
    }
}