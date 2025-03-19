class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='c'){
                if(stack.size()<2 || stack.pop()!='b' || stack.pop()!='a') return false;
            }
            else{
                stack.push(ch);
            }
        }
        
        return stack.isEmpty();

    }
}