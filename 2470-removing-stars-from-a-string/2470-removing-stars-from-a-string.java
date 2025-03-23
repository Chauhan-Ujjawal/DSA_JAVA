class Solution {
    public String removeStars(String s) {
        Stack <Character> stack = new Stack <>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){        
            if(s.charAt(i)=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}