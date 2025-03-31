class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            while (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0) {
                int sum = asteroids[i] + stack.peek();
                if (sum < 0) {  
                    stack.pop();
                } else if (sum == 0) {  
                    stack.pop(); 
                    asteroids[i] = 0;
                    break;
                } else {  
                    asteroids[i] = 0; 
                    break;
                }
            }
            if (asteroids[i] != 0) stack.push(asteroids[i]);
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
