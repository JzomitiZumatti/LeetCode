class Solution {
    public int numSub(String s) {
        final int MOD = 1_000_000_007;
        int counter = 0;
        String[] sub = s.split("0");
        System.out.println(Arrays.toString(sub));
        for (String sr : sub) {
            if (!sr.isEmpty()) {
                for (int i = sr.length(); i >= 1; i--) {
                    counter = (counter + i) % MOD;
                }
            }
        }
        return counter;
    }
}