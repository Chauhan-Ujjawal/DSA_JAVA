class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }    
        Stack<Character> stack = new Stack<>();
        char[] nums = String.valueOf(x).toCharArray();
        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[i]);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        if (isNegative) {
            sb.insert(0, '-');
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
