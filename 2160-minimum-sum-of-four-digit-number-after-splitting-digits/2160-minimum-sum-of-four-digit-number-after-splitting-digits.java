class Solution {
    public int minimumSum(int num) {
        List<Integer> list = new ArrayList<>();
        while (num / 10 != 0) {
            list.add(num % 10);
            num /= 10;
        }
        list.add(num);
        list.sort(Integer::compareTo);
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) left.append(list.get(i));
            else right.append(list.get(i));
        }
        return Integer.parseInt(left.toString()) + Integer.parseInt(right.toString());
    }
}