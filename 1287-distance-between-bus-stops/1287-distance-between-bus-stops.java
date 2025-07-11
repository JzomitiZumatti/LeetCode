class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int max = 0;
        int min = 0;
        List<Integer> indexes = new ArrayList<>();
        if (start < destination) {
            for (int i = start; i < destination; i++) {
                min += distance[i];
                indexes.add(i);
            }
        } else {
            for (int i = destination; i < start; i++) {
                min += distance[i];
                indexes.add(i);
            }
        }
        System.out.println(indexes);
        for (int i = 0; i < distance.length; i++) {
            if (!indexes.contains(i)) {
                max += distance[i];
            }
        }
        return Math.min(max, min);
    }
}