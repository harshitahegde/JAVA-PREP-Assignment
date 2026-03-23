package Module9_Recursion_Backtracking;

// LeetCode 22 – Generate Parentheses
import java.util.*;

class GenerateParentheses {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        make(result, "", 0, 0, n);

        return result;
    }

    void make(List<String> result, String current, int open, int close, int n) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) make(result, current + "(", open + 1, close, n);
        if (close < open) make(result, current + ")", open, close + 1, n);
    }
}
