class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            int landDur = landStartTime[i] + landDuration[i];
            for (int j = 0; j < waterStartTime.length; j++) {
                if (waterStartTime[j] <= landDur) min = Math.min(min, landDur + waterDuration[j]);
                else min = Math.min(min, waterStartTime[j] + waterDuration[j]);
            }
        }

        for (int i = 0; i < waterStartTime.length; i++) {
            int waterDur = waterStartTime[i] + waterDuration[i];
            for (int j = 0; j < landStartTime.length; j++) {
                if (landStartTime[j] <= waterDur) min = Math.min(min, waterDur + landDuration[j]);
                else min = Math.min(min, landStartTime[j] + landDuration[j]);
            }
        }
        return min;
    }
}