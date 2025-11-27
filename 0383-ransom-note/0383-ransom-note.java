class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransCharFreq = new HashMap<>();
        Map<Character, Integer> magCharFreq = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            ransCharFreq.put(ransomNote.charAt(i), ransCharFreq.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            magCharFreq.put(magazine.charAt(i), magCharFreq.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : ransCharFreq.entrySet()) {
            if (!magCharFreq.containsKey(entry.getKey()) || magCharFreq.get(entry.getKey()) < entry.getValue()) return false;
        }
        return true;
    }
}