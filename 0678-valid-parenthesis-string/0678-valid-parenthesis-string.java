class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);          
            if (c == '(') {
                left.push(i);
            } else if (c == ')') {
                if (!left.isEmpty()) {
                    left.pop();  
                } else if (!star.isEmpty()) {
                    star.pop();  
                } else {
                    return false; 
                }
            } else {  
                star.push(i);
            }
        }
        while (!left.isEmpty() && !star.isEmpty()) {
            if (left.pop() > star.pop()) {
                return false;
            }
        }
        return left.isEmpty();
    }
}
