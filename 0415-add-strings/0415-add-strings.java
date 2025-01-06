class Solution {
    public String addStrings(String num1, String num2) {
        String ans="";
        int i=num1.length()-1;
        int j=num2.length()-1;
        int c=0;
        while(i>=0||j>=0||c!=0){
            int isum = 0, jsum = 0;
            if (i >= 0) {
                isum = num1.charAt(i) - '0'; 
            }
            if (j >= 0) {
                jsum = num2.charAt(j) - '0'; 
            }
            int sum = isum + jsum + c; 
            ans = (sum % 10) + ans; 
            c = sum / 10; 
            i--; 
            j--; 
        }
        return ans;
    }
}