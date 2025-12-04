class Solution {
    public int largestInteger(int num) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> byN = new ArrayList<>();
        while (num / 10 != 0) {
            int n = num % 10;
            byN.add(n);
            if (n % 2 == 0) even.add(n);
            else odd.add(n);
            num /= 10;
        }
        if (num % 2 == 0) even.add(num);
        else odd.add(num);
        byN.add(num);
        odd.sort(Integer::compareTo);
        even.sort(Integer::compareTo);
        StringBuilder stringBuilder = new StringBuilder();
        int j = even.size() - 1;
        int k = odd.size() - 1;
        for (int i = byN.size() - 1; i >= 0; i--) {
            if (byN.get(i) % 2 == 0) {
                stringBuilder.append(even.get(j));
                j--;
            }
            else {
                stringBuilder.append(odd.get(k));
                k--;
            }
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}