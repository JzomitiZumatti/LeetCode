class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        switch (ruleKey) {
            case "type":
                for (List<String> item : items) {
                    if (item.get(0).equals(ruleValue)) {
                        res++;
                    }
                }
                break;
            case "color":
                for (List<String> item : items) {
                    if (item.get(1).equals(ruleValue)) {
                        res++;
                    }
                }
                break;
            case "name":
                for (List<String> item : items) {
                    if (item.get(2).equals(ruleValue)) {
                        res++;
                    }
                }
                break;
            default:
                break;
        }
        return res;
    }
}