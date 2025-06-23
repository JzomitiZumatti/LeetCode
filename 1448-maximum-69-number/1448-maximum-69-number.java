class Solution {
    public int maximum69Number (int num) {
        String n = String.valueOf(num);
        int max = num;
        StringBuilder nS = new StringBuilder(n);
        int current = 0;
        while (current < n.length()) {
            nS.setLength(0);
            int a = Character.getNumericValue(n.charAt(current));
            if (a == 6) {
                for (int i = 0; i < n.length(); i++) {
                    if (i == current) {
                        nS.append(9);
                    } else {
                        nS.append(Character.getNumericValue(n.charAt(i)));
                    }
                }
                max = Math.max(Integer.parseInt(nS.toString()), max);
            } else {
                for (int i = 0; i < n.length(); i++) {
                    if (i == current) {
                        nS.append(6);
                    } else {
                        nS.append(Character.getNumericValue(n.charAt(i)));
                    }
                }
                max = Math.max(Integer.parseInt(nS.toString()), max);
            }
            current++;
        }
        return max;
    }
}