class Solution {
    public long minTime(int[] skill, int[] mana) {
        int[] pref = new int[skill.length];
        pref[0] = skill[0];
        for (int i = 1; i < skill.length; i++) {
            pref[i] = pref[i - 1] + skill[i];
        }

        long sum = 0L;
        int pot = 1;
        while (pot < mana.length) {
            long delta = Integer.MIN_VALUE;
            for (int i = 0; i < pref.length; i++) {
                int prefVal = i == 0 ? 0 : pref[i - 1];
                long temp = (long) pref[i] * mana[pot - 1] - (long) prefVal * mana[pot];
                delta = Math.max(delta, temp);
            }
            sum += delta;
            pot++;
        }
        long lastPotTime = (long) pref[pref.length - 1] * mana[mana.length - 1];
        return sum + lastPotTime;
    }
}