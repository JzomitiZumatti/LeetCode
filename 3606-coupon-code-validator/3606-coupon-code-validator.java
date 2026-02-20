class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, Integer> catPriority = new HashMap<>();
        catPriority.put("electronics", 0);
        catPriority.put("grocery", 1);
        catPriority.put("pharmacy", 2);
        catPriority.put("restaurant", 3);
        List<String> res = new ArrayList<>();
        List<List<String>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        for (int i = 0; i < code.length; i++) {
            if (isAllowedChar(code[i]) && catPriority.containsKey(businessLine[i]) && isActive[i]) {
                int n = catPriority.get(businessLine[i]);
                if (n == 0) lists.get(0).add(code[i]);
                else if (n == 1) lists.get(1).add(code[i]);
                else if (n == 2) lists.get(2).add(code[i]);
                else lists.get(3).add(code[i]);
            }
        }
        for (List<String> list : lists) {
            list.sort(Comparator.naturalOrder());
            res.addAll(list);
        }
        return res;
    }

    private static boolean isAllowedChar(String s) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }
        return true;
    }
}