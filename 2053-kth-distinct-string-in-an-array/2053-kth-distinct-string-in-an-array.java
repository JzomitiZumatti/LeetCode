class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> strFreq = new HashMap<>();
        for (String s : arr) {
            strFreq.put(s, strFreq.getOrDefault(s, 0) + 1);
        }

        List<String> unique = new ArrayList<>();
        for (String s : arr) {
            if (strFreq.get(s) == 1) {
                unique.add(s);
            }
        }
        if (unique.size() < k) return "";
        else return unique.get(k - 1);
    }
}