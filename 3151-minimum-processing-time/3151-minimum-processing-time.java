class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        List<Integer> processorTimeList = new ArrayList<>(processorTime);
        List<Integer> tasksList = new ArrayList<>(tasks);
        Collections.sort(processorTimeList);
        Collections.sort(tasksList);

        int del = tasks.size() / processorTime.size();
        boolean flag = processorTime.size() % 2 != 0;
        int counter = 1;
        int max = Integer.MIN_VALUE;
        for (Integer integer : processorTimeList) {
            int c = 0;
            for (int j = tasksList.size() - counter; j >= 0; j--) {
                int num = integer + tasksList.get(j);
                max = Math.max(max, num);
                counter++;
                c++;
                if (!flag && c == del) break;
                if (flag && c == del + (tasks.size() % processorTime.size())) {
                    flag = false;
                    break;
                }
            }
        }
        return max;
    }
}