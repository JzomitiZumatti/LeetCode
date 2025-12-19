class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> wordSum = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            String s1 = list1[i];
            for (int j = 0; j < list2.length; j++) {
                String s2 = list2[j];
                if (Objects.equals(s1, s2)) wordSum.put(s1, i + j);
            }
        }
        int minValue = Integer.MAX_VALUE;
        for (Integer value : wordSum.values()) {
            minValue = Math.min(minValue, value);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordSum.entrySet()) {
            if (entry.getValue() == minValue) list.add(entry.getKey());
        }
        return list.toArray(new String[0]);
    }
}