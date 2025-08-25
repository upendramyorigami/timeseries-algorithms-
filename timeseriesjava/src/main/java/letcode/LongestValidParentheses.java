package letcode;

public class LongestValidParentheses {
    // LeetCode 32: Longest Valid Parentheses
    public int longestValidParentheses(String s) {
        int max = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            }
        }
        return max;
    }
}
