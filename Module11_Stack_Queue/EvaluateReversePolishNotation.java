// LeetCode 150 – Evaluate Reverse Polish Notation
import java.util.*;

class ReversePolish {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {

            if (s.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } 
            else if (s.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } 
            else if (s.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } 
            else if (s.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } 
            else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }
}