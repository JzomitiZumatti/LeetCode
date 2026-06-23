class Solution {
    public double calculateTax(int[][] brackets, int income) {
        List<Integer> amountOfM = new ArrayList<>();
        for (int i = 0; i < brackets.length; i++) {
            int a = i == 0 ? brackets[i][0] : brackets[i][0] - brackets[i - 1][0];
            if (a > income) {
                amountOfM.add(income);
                break;
            } else {
                amountOfM.add(a);
                income -= a;
            }
        }
        double ans = 0.00;
        for (int i = 0; i < amountOfM.size(); i++) {
            ans += (amountOfM.get(i) * ((double) brackets[i][1] / 100));
        }
        return Math.round(ans * 100000.0) / 100000.0;
    }
}