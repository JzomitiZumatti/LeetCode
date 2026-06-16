class Solution {
    public String maximumTime(String time) {
        StringBuilder ans = new StringBuilder();
        List<String> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            if (i <= 9) {
                ans.append('0').append(i);
            } else ans.append(i);
            first.add(ans.toString());
            ans.setLength(0);
        }
        for (int i = 0; i < 60; i++) {
            if (i <= 9) {
                ans.append('0').append(i);
            } else ans.append(i);
            second.add(ans.toString());
            ans.setLength(0);
        }
        String[] arr = time.split(":");
        int j = 1;
        ans.setLength(0);
        for (String s : arr) {
            List<String> list = j == 1 ? first : second;
            char l = s.charAt(0);
            char r = s.charAt(1);
            if (l == '?' && r == '?') ans.append(list.getLast());
            else if (l == '?' && Character.isDigit(r)) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (list.get(i).endsWith(String.valueOf(r))) {
                        ans.append(list.get(i));
                        break;
                    }
                }
            }
            else if (r == '?' && Character.isDigit(l)) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (list.get(i).startsWith(String.valueOf(l))) {
                        ans.append(list.get(i));
                        break;
                    }
                }
            }
            else ans.append(l).append(r);
            j++;
            if (j == 2) ans.append(':');
        }
        return ans.toString();
    }
}