class Solution {
    public int minDeletion(String s, int k) {
        int[] freq = new int[26];
        char[] letters = s.toCharArray();
        for (char letter : letters) {
            freq[letter - 'a']++;
        }
        Arrays.sort(freq);
        int count = 0;
        for (int i : freq) {
            if (i > 0) count++;
        }
        int d = count - k;
        int res = 0;
        if (d <= 0) return 0;
        else {
            int i = 0;
            for (int f : freq) {
                System.out.println(f + ", " + d);
                if (f > 0) {
                    res += f;
                    i++;
                }
                if (i >= d) break;
            }
        }
        return res;
    }
}