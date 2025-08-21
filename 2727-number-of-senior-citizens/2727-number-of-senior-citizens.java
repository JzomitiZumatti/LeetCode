class Solution {
    public int countSeniors(String[] details) {
        int res = 0;
        for (String d : details) {
            int i = d.length() - 4;
            int j = d.length() - 3;
            int age = Character.getNumericValue(d.charAt(i)) * 10 +
                    Character.getNumericValue(d.charAt(j));
            if (age > 60) {
                res++;
            }
        }
        return res;
    }
}