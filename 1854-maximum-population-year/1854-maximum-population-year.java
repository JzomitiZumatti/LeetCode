class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];
        for (int[] log : logs) {
            for (int i = log[0]; i < log[1]; i++) {
                population[i - 1950]++;
            }
        }
        int max = population[0];
        int year = 1950;
        for (int i = 0; i < population.length; i++) {
            if (population[i] > max) {
                max = population[i];
                year = i + 1950;
            }
        }
        return year;
    }
}