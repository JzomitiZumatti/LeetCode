class Solution {
    public int[] decimalRepresentation(int n) {
        String s = String.valueOf(n);
        List<Integer> dec = new ArrayList<>();
        int pow = 1;
        while (pow <= s.length()) {
            int de = (int) Math.pow(10, pow);
            int ss = n % de;
            if (ss > 0) dec.add(ss);
            n -= ss;
            pow++;
        }
        int[] res = new int[dec.size()];
        int i = 0;
        for (int j = dec.size() - 1; j >= 0; j--) {
            res[i] = dec.get(j);
            i++;
        }
        return res;
    }
}