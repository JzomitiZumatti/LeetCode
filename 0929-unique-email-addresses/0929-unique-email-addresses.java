class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> ans = new HashSet<>();
        for (String email : emails) {
            StringBuilder stringBuilder = new StringBuilder();
            String[] arr = email.split("@");
            String localName = arr[0];
            String domainName = arr[1];
            for (int i = 0; i < localName.length(); i++) {
                char c = localName.charAt(i);
                if (c == '+') break;
                if (c == '.') continue;
                if (Character.isAlphabetic(c)) stringBuilder.append(c);
            }
            stringBuilder.append("@").append(domainName);
            ans.add(stringBuilder.toString());
        }
        return ans.size();
    }
}