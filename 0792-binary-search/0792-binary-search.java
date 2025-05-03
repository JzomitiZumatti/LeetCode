import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> numberIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numberIndex.put(nums[i], i);
        }
        return numberIndex.getOrDefault(target, -1);
    }
}