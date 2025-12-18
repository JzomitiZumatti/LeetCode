class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] sectorsFreq = new int[n];
        for (int i = 1; i < rounds.length; i++) {
            if (rounds[i] >= rounds[i - 1]) {
                for (int j = rounds[i - 1]; j < rounds[i]; j++) {
                    sectorsFreq[j - 1] += 1;
                }
            } else {
                for (int j = rounds[i - 1]; j <= n ; j++) {
                    sectorsFreq[j - 1] += 1;
                }
                for (int j = 1; j < rounds[i] ; j++) {
                    sectorsFreq[j - 1] += 1;
                }
            }
        }
        sectorsFreq[rounds[rounds.length - 1] - 1] += 1;
        int max = -1;
        for (int i : sectorsFreq) {
            max = Math.max(max, i);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < sectorsFreq.length; i++) {
            if (sectorsFreq[i] == max) res.add(i + 1);
        }
        res.sort(Integer::compareTo);
        return res;
    }
}