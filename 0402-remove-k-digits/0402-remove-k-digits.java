class Solution {
    public String removeKdigits(String num, int k) {
        if (k >= num.length()) return "0"; // If k >= length, return "0"

        Stack<Character> stack = new Stack<>();

        // Conventional for loop to iterate over the string
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);

            // Remove larger digits from the stack (greedy removal)
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit); // Push the current digit
        }

        // Remove remaining k digits if necessary
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build the final result
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // Reverse since we constructed it from the stack (LIFO order)
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString(); // Return "0" if empty
    }
}