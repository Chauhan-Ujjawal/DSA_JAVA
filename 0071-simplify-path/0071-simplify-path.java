import java.util.Stack;
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals("") || parts[i].equals(".")) {
                continue; 
            }
            if (parts[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); // Go back one directory if possible
                }
            } else {
                stack.push(parts[i]); // Push valid directory names
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            sb.append("/").append(stack.get(i));
        }
        if (sb.length() > 0) {
            return sb.toString();
        } else {
            return "/";
        }
    }
}
