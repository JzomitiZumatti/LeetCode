import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> uniqueNums = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> uniqueNum
                = new ArrayList<>(uniqueNums);
        Collections.sort(uniqueNum);
        Arrays.fill(nums, 0);
        int i = 0;
        for (Integer num : uniqueNum) {
            if (i  < uniqueNum.size()) {
                nums[i] = num;
                i++;
            }
        }
        return uniqueNums.size();
    }
}