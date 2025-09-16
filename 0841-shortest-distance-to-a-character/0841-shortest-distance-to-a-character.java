class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> occur = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) occur.add(i);
        }

        int[] res = new int[s.length()];

        int j = 0;
        boolean isOne = occur.size() == 1;
        for (int i = 0; i < res.length; i++) {
            if (!isOne) {
                if (i < occur.get(0)) {
                    res[i] = occur.get(j) - i;
                } else if (i == occur.get(j)) {
                    if (j < occur.size() - 1) j++;
                } else {
                    res[i] = Math.min(Math.abs(occur.get(j) - i), Math.abs(occur.get(j - 1) - i));
                }
            } else {
                res[i] = Math.abs(occur.get(j) - i);
            }
        }
        return res;
    }
}