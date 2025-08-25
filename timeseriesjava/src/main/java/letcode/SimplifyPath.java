package letcode;

public class SimplifyPath {
    // LeetCode 71: Simplify Path
    public String simplifyPath(String path) {
        java.util.Deque<String> stack = new java.util.ArrayDeque<>();
        for (String part : path.split("/")) {
            if (part.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else if (!part.isEmpty() && !part.equals(".")) {
                stack.push(part);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.insert(0, "/" + stack.pollLast());
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
