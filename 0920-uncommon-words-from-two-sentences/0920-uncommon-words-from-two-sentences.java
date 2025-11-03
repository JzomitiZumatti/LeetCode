class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> uncommon = new ArrayList<>();
        Map<String, Integer> wordFreq = new HashMap<>();

        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        for (String el : arr1) {
            wordFreq.put(el, wordFreq.getOrDefault(el, 0) + 1);
        }
        for (String el : arr2) {
            wordFreq.put(el, wordFreq.getOrDefault(el, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
            if (entry.getValue() == 1) {
                uncommon.add(entry.getKey());
            }
        }
        return uncommon.toArray(new String[0]);
    }
}