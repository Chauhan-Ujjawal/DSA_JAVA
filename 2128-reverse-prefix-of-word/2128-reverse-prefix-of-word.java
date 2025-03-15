class Solution {
    public String reversePrefix(String word, char ch) {
        if (word.indexOf(ch) == -1) return word;
        Stack <Character> stack=new Stack<>();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=ch) stack.push(word.charAt(i));
            else{
                stack.push(word.charAt(i));
                break;
            }
        }
        StringBuilder sb = new StringBuilder(word);
        int n=stack.size();
        for(int k=0;k<n;k++){
            sb.setCharAt(k, stack.pop());
        }
        return sb.toString();
    }
}