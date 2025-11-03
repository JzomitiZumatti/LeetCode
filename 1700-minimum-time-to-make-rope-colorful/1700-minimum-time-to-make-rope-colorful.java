class Solution {
    public int minCost(String colors, int[] neededTime) {
        int counter = 0;
        List<List<Integer>> repeated = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < colors.length(); i++) {
            if (i > 0 && colors.charAt(i) != colors.charAt(i - 1)) {
                if (list.size() > 1) {
                    repeated.add(new ArrayList<>(list));
                }
                list.clear();
            }
            list.add(neededTime[i]);
        }
        if (list.size() > 1) {
            repeated.add(new ArrayList<>(list));
        }

        for (List<Integer> rep : repeated) {
            Collections.sort(rep);
            for (int i = 0; i < rep.size() - 1; i++) {
                counter += rep.get(i);
            }
        }

        return counter;
    }
}