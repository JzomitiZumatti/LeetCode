class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        int counter = 0;
        while (!isSorted(list)) {
            int min = Integer.MAX_VALUE;
            int a = -1;
            int b = -1;
            for (int i = 1; i < list.size(); i++) {
                int sum = list.get(i - 1) + list.get(i);
                if (sum < min) {
                    min = sum;
                    a = i - 1;
                    b = i;
                }
            }
            boolean flag = false;
            List<Integer> newlist = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (i != a && i != b) newlist.add(list.get(i));
                if ((i == a || i == b) && !flag) {
                    newlist.add(min);
                    flag = true;
                }
            }
            System.out.println(newlist);
            counter++;
            if (isSorted(newlist)) return counter;
            else list = newlist;
        }
        return counter;
    }

    private static boolean isSorted(List<Integer> list) {
        List<Integer> newlist = new ArrayList<>(list);
        newlist.sort(Comparator.naturalOrder());
        return list.equals(newlist);
    }
}