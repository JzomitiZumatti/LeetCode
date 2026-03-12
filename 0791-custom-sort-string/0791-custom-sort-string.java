class Solution {
    public String customSortString(String order, String s) {
        StringBuilder res = new StringBuilder();
        Set<Character> mustHave = new HashSet<>();
        for (int i = 0; i < order.length(); i++) {
            mustHave.add(order.charAt(i));
        }

        int[] letterFreq = new int[order.length()];
        boolean flag = true;
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                char cc = s.charAt(j);
                if (cc == c) letterFreq[i]++;
                else if (!mustHave.contains(cc) && flag) res.append(cc);
            }
            flag = false;
        }
        for (int i = letterFreq.length - 1; i >= 0; i--) {
            res.repeat(order.charAt(i), letterFreq[i]);
        }
        return res.reverse().toString();
    }
}