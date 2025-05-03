import java.util.*;
class Solution {
    public void reverseString(char[] s) {
        char[] sCopy = s.clone();
        for (int i = sCopy.length - 1, j = 0; i >= 0 && j < s.length; i--, j++) {
            s[j] = sCopy[i];
        }
    }
}