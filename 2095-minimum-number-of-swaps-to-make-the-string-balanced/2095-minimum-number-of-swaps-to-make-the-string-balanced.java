class Solution {
    public int minSwaps(String s) {
        //pushing unbalanced opening bracket in stack.
        //on encountering closing bracket check whether the satck contains anopening bracket ir not if the stack contains then pop it.
        //at last compute the size of stack+1/2
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[') stack.push(ch);
            if(ch==']'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        return (stack.size()+1)/2;
        
    }
}