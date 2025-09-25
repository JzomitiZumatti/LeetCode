class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left = 0;
        int right = skill.length - 1;
        int res = 0;
        Set<Integer> sum = new HashSet<>();
        
        while (left < right) {
            res += (skill[left] * skill[right]);
            sum.add(skill[left] + skill[right]);
            left++;
            right--;
            if (sum.size() > 1) return -1;
        }
        return res;
    }
}