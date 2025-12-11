class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minPos = -1;
        int maxPos = -1;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
                minPos = i;
            }
            if (salary[i] > max) {
                max = salary[i];
                maxPos = i;
            }
        }
        
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (i != minPos && i != maxPos) sum += salary[i];
        }
        return sum / (salary.length - 2);
    }
}