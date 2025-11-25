import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public boolean areNumbersAscending(String s) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        List<Integer> nums = new ArrayList<>();
        while (matcher.find()) {
            int add = Integer.parseInt(matcher.group());
            if (!nums.isEmpty()) {
                if (nums.get(nums.size() - 1) >= add) return false;
            }
            nums.add(Integer.parseInt(matcher.group()));
        }
        return true;
    }
}