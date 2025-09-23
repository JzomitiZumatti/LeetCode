class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        List<Integer> processorTimeList = new ArrayList<>(processorTime);
        List<Integer> tasksList = new ArrayList<>(tasks);
        Collections.sort(processorTimeList);
        Collections.sort(tasksList);
        int del = tasks.size() / processorTime.size();
        boolean flag = processorTime.size() % 2 != 0;
        int counter = tasksList.size();
        int max = Integer.MIN_VALUE;
        
        for (Integer integer : processorTimeList) {
            int num = integer + tasksList.get(counter - 1);
            max = Math.max(max, num);
            if (!flag) counter = counter - del;
            if (flag) {
                counter -= del + (tasks.size() % processorTime.size());
                flag = false;
            }
        }
        return max;
    }
}