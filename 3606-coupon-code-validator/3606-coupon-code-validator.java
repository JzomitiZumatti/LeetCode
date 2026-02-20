class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, Integer> catPriority = new HashMap<>();
        catPriority.put("electronics", 0);
        catPriority.put("grocery", 1);
        catPriority.put("pharmacy", 2);
        catPriority.put("restaurant", 3);
        List<String> res = new ArrayList<>();
        List<List<String>> lists = new ArrayList<>();
        int j = 0;
        while (j <= 3) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < code.length; i++) {
                if (isAllowedChar(code[i]) && catPriority.containsKey(businessLine[i]) &&
                        catPriority.get(businessLine[i]) == j && isActive[i]) {
                    list.add(code[i]);
                }
            }
            list.sort(Comparator.naturalOrder());
            lists.add(list);
            j++;
        }
        for (List<String> list : lists) {
            res.addAll(list);
        }
        return res;
    }

    private static boolean isAllowedChar(String s) {
        if (s.isEmpty()) return false;
        Set<Integer> allowedChars = new HashSet<>();
        for (int i = 48; i <= 57; i++) {
            allowedChars.add(i);
        }
        for (int i = 65; i <= 90; i++) {
            allowedChars.add(i);
        }
        allowedChars.add(95);
        for (int i = 97; i <= 122; i++) {
            allowedChars.add(i);
        }
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            if (!allowedChars.contains(ascii)) return false;
        }
        return true;
    }
}