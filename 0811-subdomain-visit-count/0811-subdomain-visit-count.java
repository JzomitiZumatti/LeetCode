class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> domainVisits = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String cpdomain : cpdomains) {
            String[] parts = cpdomain.split("[\\s.]+");
            if (parts.length == 4) {
                stringBuilder.append(parts[1]).append(".").append(parts[2]).append(".").append(parts[3]);
                domainVisits.put(stringBuilder.toString(),
                        domainVisits.getOrDefault(stringBuilder.toString(), 0)
                                + Integer.parseInt(parts[0]));
                stringBuilder.setLength(0);
                stringBuilder.append(parts[2]).append(".").append(parts[3]);
                domainVisits.put(stringBuilder.toString(),
                        domainVisits.getOrDefault(stringBuilder.toString(), 0)
                                + Integer.parseInt(parts[0]));
                stringBuilder.setLength(0);
                stringBuilder.append(parts[3]);
                domainVisits.put(stringBuilder.toString(),
                        domainVisits.getOrDefault(stringBuilder.toString(), 0)
                                + Integer.parseInt(parts[0]));
                stringBuilder.setLength(0);
            } else {
                stringBuilder.append(parts[1]).append(".").append(parts[2]);
                domainVisits.put(stringBuilder.toString(),
                        domainVisits.getOrDefault(stringBuilder.toString(), 0)
                                + Integer.parseInt(parts[0]));
                stringBuilder.setLength(0);
                stringBuilder.append(parts[2]);
                domainVisits.put(stringBuilder.toString(),
                        domainVisits.getOrDefault(stringBuilder.toString(), 0)
                                + Integer.parseInt(parts[0]));
                stringBuilder.setLength(0);
            }
        }
        stringBuilder.setLength(0);
        for (Map.Entry<String, Integer> entry : domainVisits.entrySet()) {
            res.add(stringBuilder.append(entry.getValue()).append(" ").append(entry.getKey()).toString());
            stringBuilder.setLength(0);
        }
        return res;
    }
}