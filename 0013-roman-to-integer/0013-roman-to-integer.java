import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> romanDigit = new HashMap<>();
    int number = 0;
    romanDigit.put("I", 1);
    romanDigit.put("V", 5);
    romanDigit.put("X", 10);
    romanDigit.put("L", 50);
    romanDigit.put("C", 100);
    romanDigit.put("D", 500);
    romanDigit.put("M", 1000);

    if (s.length() == 1) {
        number = romanDigit.get(String.valueOf(s.charAt(0)));
    } else {
        int i = 0;
        while (i < s.length() - 1) {
            int first = romanDigit.get(String.valueOf(s.charAt(i)));
            int second = romanDigit.get(String.valueOf(s.charAt(i + 1)));
            if (first < second) {
                number += (second - first);
                i += 2;
            } else {
                number += first;
                i += 1;
            }
        }
        if (i == s.length() - 1) {
            number += romanDigit.get(String.valueOf(s.charAt(i)));
        }
    }
    return number;
    }
}