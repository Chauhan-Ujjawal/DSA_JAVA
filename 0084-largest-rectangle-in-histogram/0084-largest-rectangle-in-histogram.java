import java.util.Stack;

class Solution {
    public static int[] Nge(int[] heights) {
        int[] nextgreater = new int[heights.length];  
        Stack<Integer> Gstack = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!Gstack.isEmpty() && heights[Gstack.peek()] >= heights[i]) {
                Gstack.pop();
            }
            if (Gstack.isEmpty()) nextgreater[i] = heights.length; 
            else nextgreater[i] = Gstack.peek(); 
            Gstack.push(i);
        }
        return nextgreater;
    }
    public static int[] Pse(int[] heights) {
        int[] previousmaller = new int[heights.length];
        Stack<Integer> Pstack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!Pstack.isEmpty() && heights[Pstack.peek()] >= heights[i]) {
                Pstack.pop();
            }
            if (Pstack.isEmpty()) previousmaller[i] = -1; 
            else previousmaller[i] = Pstack.peek(); 

            Pstack.push(i);
        }
        return previousmaller;
    }
    public int largestRectangleArea(int[] heights) {
        int[] nextgreater = Nge(heights);
        int[] previousmaller = Pse(heights);
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = nextgreater[i] - previousmaller[i] - 1;
            maxArea = Math.max(maxArea, heights[i] * width);
        }
        return maxArea;
    }
}
