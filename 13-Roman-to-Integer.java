class Solution {
    public int romanToInt(String s) {
        int result=0, ans=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I': ans=1; break;
                case 'V': ans=5; break;
                case 'X': ans=10; break;
                case 'L': ans=50; break;
                case 'C': ans=100; break;
                case 'D': ans=500; break;
                case 'M': ans=1000; break;
            }
            if(ans*3<result){
                result-=ans;
            }else{
                result+=ans;
            }
        }
        return result;

    }
}