class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int ans = 0;
        int sum = 0;
        for (int e : energy) {
            sum += e;
        }
        if (initialEnergy <= sum) ans += (sum + 1 - initialEnergy);
        for (int j : experience) {
            if (initialExperience <= j) {
                while (initialExperience <= j) {
                    initialExperience++;
                    ans++;
                }
            }
            initialExperience += j;
        }
        return ans;
    }
}