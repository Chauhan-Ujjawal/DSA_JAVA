class Solution {
    public static boolean checker(Stack <Character> stack , String part){
        // Creating a copy of the stack
        Stack<Character> copiedStack = new Stack<>();
        copiedStack.addAll(stack);
        for(int i=0;i<part.length();i++){
            if(copiedStack.pop()==part.charAt(part.length()-i-1)){
                continue;
            }else{
                return false;
            }   
        }
        return true;
    }
    public String removeOccurrences(String s, String part) {
        //keep iterating and pushing characters in stack
        //when stack length >=part length
          //start compairing characters in stack with part characters in reverse
          //if at any point condition does not match bort this operation
        //iterate and push and check if size of stack >=part length 
          //start compairing and start over agin if condition does not satisfies
          Stack<Character> stack=new Stack<>();
          for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
            if(stack.size()>=part.length() && checker(stack,part)){
                for(int q=0;q<part.length();q++){
                    stack.pop();
                }
            }
          }
          StringBuilder sb = new StringBuilder();
          while(!stack.isEmpty()){
            sb.append(stack.pop());
          }
          return sb.reverse().toString();
    }
}