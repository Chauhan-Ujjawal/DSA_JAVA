class Solution {
    public int compress(char[] chars) {
        int count=1;
        int index=0;
        for(int i=0;i<chars.length;i++){
            if(i+1<chars.length && chars[i]==chars[i+1]) count++;
            else{
                chars[index]=chars[i];
                index++;
                if (count > 1) {
                    String countstr = String.valueOf(count); 
                    for (int k = 0; k < countstr.length(); k++) {
                        chars[index] = countstr.charAt(k);
                        index++;
                    }
                }
                count=1;
            }
        }
        return index;
    }
}