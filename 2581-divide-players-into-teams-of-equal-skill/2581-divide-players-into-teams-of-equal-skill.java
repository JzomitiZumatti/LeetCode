class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left = 0;
        int right = skill.length - 1;
        long res = 0;

        while (left < right) {
            res += (long) skill[left] * skill[right];
            int temp = skill[left] + skill[right];
            left++;
            right--;
            if (temp != skill[left] + skill[right]) return -1;
        }
        return res;
    }
}