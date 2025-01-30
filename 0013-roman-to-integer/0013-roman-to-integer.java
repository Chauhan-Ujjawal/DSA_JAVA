class Solution {
    public int convert(int a ,char[] arr){
        if(arr[a]=='I') return 1;
        if(arr[a]=='V') return 5;
        if(arr[a]=='X') return 10;
        if(arr[a]=='L') return 50;
        if(arr[a]=='C') return 100;
        if(arr[a]=='D') return 500;
        if(arr[a]=='M') return 1000;
        return 0;
    }
    public int romanToInt(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int sum=0;
        while(i<arr.length){
            if(i<arr.length-1 && convert(i,arr)<convert(i+1,arr)){
                sum+=convert(i+1,arr)-convert(i,arr);
                //skipping next character becoz it got processed
                i+=2;
            }
            else{
                sum+=convert(i,arr);
                i++;
            }
        }
        return sum;
    }
}