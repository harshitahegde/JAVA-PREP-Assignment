// LeetCode 242 – Valid Anagram
import java.util.*;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}